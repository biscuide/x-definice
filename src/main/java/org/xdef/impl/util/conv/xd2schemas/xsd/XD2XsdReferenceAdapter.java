package org.xdef.impl.util.conv.xd2schemas.xsd;

import org.apache.ws.commons.schema.XmlSchema;
import org.apache.ws.commons.schema.XmlSchemaElement;
import org.apache.ws.commons.schema.XmlSchemaType;
import org.xdef.impl.XData;
import org.xdef.impl.XDefinition;
import org.xdef.impl.XElement;
import org.xdef.impl.XNode;
import org.xdef.impl.util.conv.xd2schemas.xsd.factory.XsdElementFactory;
import org.xdef.impl.util.conv.xd2schemas.xsd.model.XmlSchemaImportLocation;
import org.xdef.impl.util.conv.xd2schemas.xsd.model.XsdAdapterCtx;
import org.xdef.impl.util.conv.xd2schemas.xsd.util.*;
import org.xdef.model.XMNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import static org.xdef.impl.util.conv.xd2schemas.xsd.util.AlgPhase.PREPROCESSING;
import static org.xdef.impl.util.conv.xd2schemas.xsd.util.AlgPhase.TRANSFORMATION;
import static org.xdef.impl.util.conv.xd2schemas.xsd.util.XsdLoggerDefs.*;
import static org.xdef.model.XMNode.XMATTRIBUTE;

class XD2XsdReferenceAdapter {

    private final XmlSchema schema;
    private final XsdElementFactory xsdFactory;
    private final XDTree2XsdAdapter treeAdapter;
    private final XsdAdapterCtx adapterCtx;

    private boolean isPostProcessingPhase = false;

    private Set<String> simpleTypeReferences;
    private Set<String> namespaceImports;
    /**
     * X-definition without target namespace
     */
    private Set<String> namespaceIncludes;

    public XD2XsdReferenceAdapter(XmlSchema schema, XsdElementFactory xsdFactory, XDTree2XsdAdapter treeAdapter, XsdAdapterCtx adapterCtx) {
        this.schema = schema;
        this.xsdFactory = xsdFactory;
        this.treeAdapter = treeAdapter;
        this.adapterCtx = adapterCtx;
    }

    protected void setPostProcessing() {
        this.isPostProcessingPhase = true;
    }

    /**
     * Creates following nodes from x-definition:
     *      simpleType      - attribute type
     *      complexType     - element type
     *      import          - used namespaces in reference of attributes and elements
     * @param xDef
     */
    protected void createRefsAndImports(XDefinition xDef) {
        simpleTypeReferences = new HashSet<String>();
        namespaceImports = new HashSet<String>();
        namespaceIncludes = new HashSet<String>();
        extractRefsAndImports(xDef);
    }

    private void extractRefsAndImports(XDefinition xDef) {
        XsdLogger.printP(LOG_INFO, PREPROCESSING, xDef, "*** Creating definition of references and schemas import/include ***");

        final Set<XMNode> processed = new HashSet<XMNode>();

        // Extract all simple types and imports
        XsdLogger.printP(LOG_INFO, PREPROCESSING, xDef, "Extracting simple references and imports ...");
        for (XElement elem : xDef.getXElements()) {
            extractSimpleRefsAndImports(elem, processed, false);
        }

        // Extract all complex types
        XsdLogger.printP(LOG_INFO, PREPROCESSING, xDef, "Extracting complex references ...");
        for (XElement elem : xDef.getXElements()) {
            if (!treeAdapter.getXdRootNames().contains(elem.getName())) {
                extractTopLevelElementRefs(elem);
            }
        }
    }

    protected void extractRefsAndImports(ArrayList<XNode> nodes) {
        simpleTypeReferences = new HashSet<String>();
        namespaceImports = new HashSet<String>();
        namespaceIncludes = new HashSet<String>();

        final Set<XMNode> processed = new HashSet<XMNode>();

        for (XNode n : nodes) {
            // Extract all simple types and imports
            XsdLogger.printP(LOG_INFO, PREPROCESSING, n, "Extracting simple references and imports ...");
            extractSimpleRefsAndImports(n, processed, false);

            // TODO: Should be used?
            // Extract all complex types
            /*
            if (n.getKind() == XNode.XMELEMENT) {
                XsdLogger.printP(LOG_INFO, PREPROCESSING, n, "Extracting complex references ...");
                XElement xElem = (XElement)n;
                for (XNode childNode : xElem._childNodes) {
                    if (childNode.getKind() == XNode.XMELEMENT) {
                        extractTopLevelElementRefs(childNode);
                    }
                }
            }
            */
        }
    }

    private void extractTopLevelElementRefs(final XNode xNode) {
        XsdLogger.printP(LOG_DEBUG, PREPROCESSING, xNode, "Creating definition of reference");

        XmlSchemaElement xsdElem = (XmlSchemaElement) treeAdapter.convertTree(xNode);
        XmlSchemaType elementType = xsdElem.getSchemaType();
        if (elementType == null) {
            XsdLogger.printP(LOG_INFO, PREPROCESSING, xNode, "Add definition of reference as element. Element=" + xsdElem.getName());
        } else if (elementType instanceof XmlSchemaType) {
            XsdReferenceUtils.updateNode(xNode, elementType, adapterCtx.getNodeRefs());
            elementType.setName(xsdElem.getName());
            XD2XsdUtils.addSchemaType(schema, elementType);
            schema.getItems().remove(xsdElem);
            XsdLogger.printP(LOG_INFO, PREPROCESSING, xNode, "Add definition of reference as complex/simple type. Element=" + xsdElem.getName());
        }
    }

    private void extractSimpleRefsAndImports(XNode xn, final Set<XMNode> processed, boolean parentRef) {

        if (!processed.add(xn)) {
            XsdLogger.printP(LOG_DEBUG, PREPROCESSING, xn, "Already processed. This node is reference probably");
            return;
        }

        switch (xn.getKind()) {
            case XNode.XMELEMENT: {
                XsdLogger.printP(LOG_DEBUG, PREPROCESSING, xn, "Processing XMElement node. Node=" + xn.getName());

                XElement xDefEl = (XElement)xn;
                XMNode[] attrs = xDefEl.getXDAttrs();

                for (int i = 0; i < attrs.length; i++) {
                    addSimpleTypeReference((XData)attrs[i]);
                }

                boolean isRef = false;

                if (xDefEl.isReference()) {
                    final String refPos = xDefEl.getReferencePos();
                    if (XsdNamespaceUtils.isNodeInDifferentNamespace(xDefEl.getName(), xDefEl.getNSUri(), schema)) {
                        addSchemaImportFromElem(xDefEl.getNSUri(), refPos);
                    } else if (XsdNamespaceUtils.isRefInDifferentNamespacePrefix(refPos, schema)) {
                        final String refSystemId = XsdNamespaceUtils.getReferenceSystemId(refPos);
                        XmlSchema refSchema = XsdNamespaceUtils.getSchema(schema.getParent(), refSystemId, true, PREPROCESSING);
                        final String refNsPrefix = XsdNamespaceUtils.getReferenceNamespacePrefix(refPos);
                        final String nsUri = refSchema.getNamespaceContext().getNamespaceURI(refNsPrefix);
                        addSchemaImportFromElem(nsUri, refPos);
                    } else if (XsdNamespaceUtils.isRefInDifferentSystem(refPos, xDefEl.getXDPosition())) {
                        addSchemaInclude(refPos);
                    } // else {} // Reference in same x-definition and same namespace

                    isRef = true;
                } else {
                    // Element is not reference but name contains different namespace prefix -> we will have to create reference in new namespace in post-processing
                    if (XsdNamespaceUtils.isNodeInDifferentNamespacePrefix(xDefEl.getName(), schema) && isPostProcessingPhase == false) {
                        String nsPrefix = XsdNamespaceUtils.getNamespacePrefix(xDefEl.getName());
                        String nsUri = schema.getNamespaceContext().getNamespaceURI(nsPrefix);

                        // Post-processing
                        if (nsUri != null && !nsUri.isEmpty()) {
                            XmlSchemaImportLocation importLocation = adapterCtx.getSchemaLocationsCtx().get(nsUri);
                            if (importLocation != null) {
                                addPostProcessingSchema(nsUri, importLocation);
                            } else {
                                addPostProcessingSchemaImport(nsPrefix, nsUri);
                            }
                        } else {
                            final String xDefPos = xDefEl.getXDPosition();
                            nsUri = XsdNamespaceUtils.getNsUriInSystem(xDefEl, schema);

                            if (nsUri == null || nsUri.isEmpty()) {
                                if (parentRef == false) {
                                    nsPrefix = XsdNamespaceUtils.getReferenceNamespacePrefix(xDefPos);
                                    XsdLogger.printP(LOG_ERROR, TRANSFORMATION, xDefEl, "Element referencing to unknown namespace! NamespacePrefix=" + nsPrefix);
                                }
                            } else {
                                addSchemaImportFromElem(nsUri, xDefPos);
                            }
                        }

                        isRef = true;
                    }
                }

                if (isRef == false) {
                    int childrenCount = xDefEl._childNodes.length;
                    for (XNode xChild : xDefEl._childNodes) {
                        if (xChild.getKind() == XNode.XMTEXT && (childrenCount > 1 || ((XData) xChild).getRefTypeName() != null)) {
                            addSimpleTypeReference((XData) xChild);
                        } else {
                            extractSimpleRefsAndImports(xChild, processed, xDefEl.isReference() || XsdNamespaceUtils.isNodeInDifferentNamespacePrefix(xDefEl.getName(), schema));
                        }
                    }
                }

                return;
            }
            case XNode.XMDEFINITION: {
                XsdLogger.printP(LOG_DEBUG, PREPROCESSING, xn, "Processing XDefinition node. Node=" + xn.getName());

                XDefinition def = (XDefinition)xn;
                XElement[] elems = def.getXElements();
                for (int i = 0; i < elems.length; i++){
                    extractSimpleRefsAndImports(elems[i], processed, false);
                }
                return;
            }
        }
    }

    private void addSimpleTypeReference(final XData xData) {
        String refTypeName = xData.getRefTypeName();
        final boolean isAttrRef = xData.getKind() == XMATTRIBUTE;

        // Simple type node
        if (refTypeName != null && simpleTypeReferences.add(refTypeName)) {
            xsdFactory.creatSimpleTypeTop(xData, refTypeName);
            XsdLogger.printP(LOG_INFO, TRANSFORMATION, xData, "Creating simple type definition from reference. Name=" + refTypeName);
            return;
        }

        if (isAttrRef == false && refTypeName == null && XD2XsdUtils.getDefaultSimpleParserQName(xData) == null && xData.getValueTypeName() != null) {
            refTypeName = XsdNameUtils.createRefNameFromParser(xData);
            if (refTypeName != null && simpleTypeReferences.add(refTypeName)) {
                xsdFactory.creatSimpleTypeTop(xData, refTypeName);
                XsdLogger.printP(LOG_INFO, TRANSFORMATION, xData, "Creating simple type reference from parser. Name=" + refTypeName);
                return;
            }
        }

        // Element is not reference but name contains different namespace prefix -> we will have to create reference in new namespace in post-processing
        if (XsdNamespaceUtils.isNodeInDifferentNamespacePrefix(xData.getName(), schema) && isPostProcessingPhase == false) {
            String nsPrefix = XsdNamespaceUtils.getNamespacePrefix(xData.getName());
            String nsUri = schema.getNamespaceContext().getNamespaceURI(nsPrefix);

            // Post-processing
            if (nsUri != null && !nsUri.isEmpty()) {
                XmlSchemaImportLocation importLocation = adapterCtx.getSchemaLocationsCtx().get(nsUri);
                if (importLocation != null) {
                    addPostProcessingSchema(nsUri, importLocation);
                }
            }
        }

        final String importNamespace = xData.getNSUri();
        if (importNamespace != null && XsdNamespaceUtils.isNodeInDifferentNamespace(xData.getName(), importNamespace, schema)) {
            addSchemaImportFromSimpleType(XsdNamespaceUtils.getNamespacePrefix(xData.getName()), importNamespace);
        }
    }

    private void addSchemaInclude(final String refName) {
        final String refSystemId = XsdNamespaceUtils.getReferenceSystemId(refName);

        if (refSystemId == null || !namespaceIncludes.add(refSystemId)) {
            return;
        }

        if (adapterCtx.getSchemaLocationsCtx().containsKey(refSystemId)) {
            XsdLogger.printP(LOG_INFO, PREPROCESSING, "Add schema include. SchemaName=" + refSystemId);
            xsdFactory.createSchemaInclude(schema, adapterCtx.getSchemaLocationsCtx().get(refSystemId).buildLocalition(refSystemId));
        } else {
            XsdLogger.printP(LOG_WARN, PREPROCESSING, "Required schema import has not been found! SchemaName=" + refSystemId);
        }
    }

    private void addSchemaImportFromElem(final String nsUri, final String refName) {
        if (nsUri == null || !namespaceImports.add(nsUri)) {
            return;
        }

        if (adapterCtx.getSchemaLocationsCtx().containsKey(nsUri)) {
            XsdLogger.printP(LOG_INFO, PREPROCESSING, "Add namespace import. NamespaceURI=" + nsUri);
            xsdFactory.createSchemaImport(schema, nsUri, adapterCtx.getSchemaLocationsCtx().get(nsUri).buildLocalition(XsdNamespaceUtils.getReferenceSystemId(refName)));
        } else {
            XsdLogger.printP(LOG_WARN, PREPROCESSING, "Required schema import has not been found! NamespaceURI=" + nsUri);
        }
    }

    private void addSchemaImportFromSimpleType(final String nsPrefix, final String nsUri) {
        if (nsUri == null || !namespaceImports.add(nsUri)) {
            return;
        }

        if (adapterCtx.getSchemaLocationsCtx().containsKey(nsUri)) {
            XsdLogger.printP(LOG_INFO, PREPROCESSING, "Add namespace import. NamespaceURI=" + nsUri);
            xsdFactory.createSchemaImport(schema, nsUri, adapterCtx.getSchemaLocationsCtx().get(nsUri).buildLocalition(null));
        } else if (adapterCtx.getExtraSchemaLocationsCtx() != null) {
            if (!adapterCtx.getExtraSchemaLocationsCtx().containsKey(nsUri)) {
                addPostProcessingSchemaImportInt(nsPrefix, nsUri);
            } else if (isPostProcessingPhase) {
                XsdLogger.printP(LOG_INFO, PREPROCESSING, "Add namespace import. NamespaceURI=" + nsUri);
                xsdFactory.createSchemaImport(schema, nsUri, adapterCtx.getExtraSchemaLocationsCtx().get(nsUri).buildLocalition(null));
            }
        }
    }

    private void addPostProcessingSchemaImport(final String nsPrefix, final String nsUri) {
        if (nsUri == null || !namespaceImports.add(nsUri)) {
            return;
        }

        addPostProcessingSchemaImportInt(nsPrefix, nsUri);
    }

    private void addPostProcessingSchemaImportInt(final String nsPrefix, final String nsUri) {
        if (adapterCtx.getExtraSchemaLocationsCtx() != null) {
            if (!adapterCtx.getExtraSchemaLocationsCtx().containsKey(nsUri)) {
                final String schemaName = XsdNamespaceUtils.createExtraSchemaNameFromNsPrefix(nsPrefix);
                XsdLogger.printP(LOG_INFO, PREPROCESSING, "Add external namespace import. NamespaceURI=" + nsUri + ", SchemaName=" + schemaName);
                adapterCtx.getExtraSchemaLocationsCtx().put(nsUri, new XmlSchemaImportLocation(nsUri, schemaName));
                XsdLogger.printP(LOG_INFO, PREPROCESSING, "Add external schema to post-process queue. NamespaceURI=" + nsUri + ", SchemaName=" + schemaName);
                xsdFactory.createSchemaImport(schema, nsUri, adapterCtx.getExtraSchemaLocationsCtx().get(nsUri).buildLocalition(null));
            } else {
                xsdFactory.createSchemaImport(schema, nsUri, adapterCtx.getExtraSchemaLocationsCtx().get(nsUri).buildLocalition(null));
            }
        }
    }

    private void addPostProcessingSchema(final String nsUri, final XmlSchemaImportLocation schemaImportLocation) {
        if (adapterCtx.getExtraSchemaLocationsCtx().containsKey(nsUri)) {
            return;
        }

        XsdLogger.printP(LOG_INFO, PREPROCESSING, "Add schema to post-process queue. NamespaceURI=" + nsUri);
        adapterCtx.getExtraSchemaLocationsCtx().put(nsUri, schemaImportLocation);
    }

}
