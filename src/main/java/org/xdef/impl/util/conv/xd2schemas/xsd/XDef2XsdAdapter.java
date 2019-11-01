package org.xdef.impl.util.conv.xd2schemas.xsd;

import javafx.util.Pair;
import org.apache.ws.commons.schema.XmlSchema;
import org.apache.ws.commons.schema.XmlSchemaCollection;
import org.xdef.XDPool;
import org.xdef.impl.XDefinition;
import org.xdef.impl.XElement;
import org.xdef.impl.util.conv.xd2schemas.XDef2SchemaAdapter;
import org.xdef.impl.util.conv.xd2schemas.xsd.adapter.AbstractXd2XsdAdapter;
import org.xdef.impl.util.conv.xd2schemas.xsd.adapter.XD2XsdPostProcessingAdapter;
import org.xdef.impl.util.conv.xd2schemas.xsd.adapter.XD2XsdReferenceAdapter;
import org.xdef.impl.util.conv.xd2schemas.xsd.adapter.XDTree2XsdAdapter;
import org.xdef.impl.util.conv.xd2schemas.xsd.factory.XsdElementFactory;
import org.xdef.impl.util.conv.xd2schemas.xsd.factory.XsdSchemaFactory;
import org.xdef.impl.util.conv.xd2schemas.xsd.model.XsdAdapterCtx;
import org.xdef.impl.util.conv.xd2schemas.xsd.util.XsdLogger;
import org.xdef.impl.util.conv.xd2schemas.xsd.util.XsdNamespaceUtils;
import org.xdef.model.XMDefinition;

import static org.xdef.impl.util.conv.xd2schemas.xsd.definition.AlgPhase.INITIALIZATION;
import static org.xdef.impl.util.conv.xd2schemas.xsd.definition.AlgPhase.TRANSFORMATION;
import static org.xdef.impl.util.conv.xd2schemas.xsd.definition.XsdLoggerDefs.LOG_INFO;
import static org.xdef.impl.util.conv.xd2schemas.xsd.definition.XsdLoggerDefs.XSD_XDEF_ADAPTER;

public class XDef2XsdAdapter extends AbstractXd2XsdAdapter implements XDef2SchemaAdapter<XmlSchemaCollection> {

    /**
     * Input x-definition used for transformation
     */
    private XDefinition xDefinition = null;

    /**
     * Output xsd schema
     */
    private XmlSchema schema = null;

    @Override
    public XmlSchemaCollection createSchema(final XDPool xdPool) {
        if (xdPool == null) {
            throw new IllegalArgumentException("xdPool = null");
        }
        return createSchema(xdPool.getXMDefinition());
    }

    @Override
    public XmlSchemaCollection createSchema(final XMDefinition xDef) {
        if (xDef == null) {
            throw new IllegalArgumentException("xdef = null");
        }

        XsdLogger.printG(LOG_INFO, XSD_XDEF_ADAPTER, "====================");
        XsdLogger.printG(LOG_INFO, XSD_XDEF_ADAPTER, "Transforming x-definition. Name=" + xDef.getName());
        XsdLogger.printG(LOG_INFO, XSD_XDEF_ADAPTER, "====================");

        boolean poolPostProcessing = true;

        this.xDefinition = (XDefinition)xDef;
        if (adapterCtx == null) {
            adapterCtx = new XsdAdapterCtx();
            adapterCtx.init();
            schema = createXsdSchema();
            poolPostProcessing = false;
        } else {
            schema = adapterCtx.getSchema(xDef.getName(), false, INITIALIZATION);
        }

        XsdElementFactory xsdFactory = new XsdElementFactory(schema);
        XDTree2XsdAdapter treeAdapter = new XDTree2XsdAdapter(schema, xDef.getName(), xsdFactory, adapterCtx);
        XD2XsdReferenceAdapter referenceAdapter = new XD2XsdReferenceAdapter(schema, xsdFactory, treeAdapter, adapterCtx);

        treeAdapter.loadXdefRootNames(xDefinition);
        referenceAdapter.createRefsAndImports(xDefinition);
        transformXdef(treeAdapter);

        if (!poolPostProcessing) {
            XD2XsdPostProcessingAdapter postProcessingAdapter = new XD2XsdPostProcessingAdapter();
            postProcessingAdapter.setAdapterCtx(adapterCtx);
            postProcessingAdapter.process(xDefinition);
        }

        return adapterCtx.getXmlSchemaCollection();
    }

    /**
     * Transform x-definition tree to xsd schema via treeAdapter
     * @param treeAdapter   transformation algorithm
     */
    private void transformXdef(final XDTree2XsdAdapter treeAdapter) {
        XsdLogger.printP(LOG_INFO, TRANSFORMATION, xDefinition, "*** Transformation of x-definition tree ***");

        for (XElement elem : xDefinition.getXElements()) {
            if (treeAdapter.getXdRootNames().contains(elem.getName())) {
                treeAdapter.convertTree(elem);
                XsdLogger.printP(LOG_INFO, TRANSFORMATION, elem, "Adding root element to schema. Element=" + elem.getName());
            }
        }
    }

    /**
     * Creates and initialize XSD schema
     */
    private XmlSchema createXsdSchema() {
        // Target namespace
        Boolean targetNamespaceError = false;
        Pair<String, String> targetNamespace = XsdNamespaceUtils.getSchemaTargetNamespace(xDefinition, targetNamespaceError);

        XsdLogger.printP(LOG_INFO, INITIALIZATION, xDefinition, "Creating XSD schema. " +
                "systemName=" + xDefinition.getName() + ", targetNamespacePrefix=" + targetNamespace.getKey() + ", targetNamespaceUri=" + targetNamespace.getValue());

        XsdSchemaFactory schemaFactory = new XsdSchemaFactory(adapterCtx);
        return schemaFactory.createXsdSchema(xDefinition, targetNamespace);
    }

}
