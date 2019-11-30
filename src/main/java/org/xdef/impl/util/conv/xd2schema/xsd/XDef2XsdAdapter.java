package org.xdef.impl.util.conv.xd2schema.xsd;

import javafx.util.Pair;
import org.apache.ws.commons.schema.XmlSchema;
import org.apache.ws.commons.schema.XmlSchemaCollection;
import org.xdef.XDPool;
import org.xdef.impl.XDefinition;
import org.xdef.impl.XElement;
import org.xdef.impl.util.conv.xd2schema.XDef2SchemaAdapter;
import org.xdef.impl.util.conv.xd2schema.xsd.adapter.AbstractXd2XsdAdapter;
import org.xdef.impl.util.conv.xd2schema.xsd.adapter.XD2XsdPostProcessingAdapter;
import org.xdef.impl.util.conv.xd2schema.xsd.adapter.XD2XsdReferenceAdapter;
import org.xdef.impl.util.conv.xd2schema.xsd.adapter.XD2XsdTreeAdapter;
import org.xdef.impl.util.conv.xd2schema.xsd.factory.XsdElementFactory;
import org.xdef.impl.util.conv.xd2schema.xsd.factory.XsdSchemaFactory;
import org.xdef.impl.util.conv.xd2schema.xsd.model.XsdAdapterCtx;
import org.xdef.impl.util.conv.schema.util.XsdLogger;
import org.xdef.impl.util.conv.xd2schema.xsd.util.XsdNamespaceUtils;
import org.xdef.model.XMDefinition;

import java.util.Set;

import static org.xdef.impl.util.conv.xd2schema.xsd.definition.AlgPhase.INITIALIZATION;
import static org.xdef.impl.util.conv.xd2schema.xsd.definition.AlgPhase.TRANSFORMATION;
import static org.xdef.impl.util.conv.schema.util.XsdLoggerDefs.LOG_INFO;
import static org.xdef.impl.util.conv.schema.util.XsdLoggerDefs.XSD_XDEF_ADAPTER;

/**
 * Transformation of given x-definition or x-definition pool to collection of XSD schemas
 */
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
            adapterCtx = new XsdAdapterCtx(features);
            adapterCtx.init();
            schema = createXsdSchema();
            poolPostProcessing = false;
        } else {
            schema = adapterCtx.findSchema(xDef.getName(), false, INITIALIZATION);
        }

        final XsdElementFactory xsdFactory = new XsdElementFactory(schema, adapterCtx);
        final XD2XsdTreeAdapter treeAdapter = new XD2XsdTreeAdapter(schema, xDef.getName(), xsdFactory, adapterCtx);
        final XD2XsdReferenceAdapter referenceAdapter = new XD2XsdReferenceAdapter(schema, xDef.getName(), xsdFactory, treeAdapter, adapterCtx);

        treeAdapter.loadXdefRootNames(xDefinition);
        treeAdapter.loadXdefRootUniqueSets(xDefinition);
        referenceAdapter.createRefsAndImports(xDefinition);
        transformXdef(treeAdapter);

        if (!poolPostProcessing) {
            final XD2XsdPostProcessingAdapter postProcessingAdapter = new XD2XsdPostProcessingAdapter();
            postProcessingAdapter.setAdapterCtx(adapterCtx);
            postProcessingAdapter.process(xDefinition);
        }

        return adapterCtx.getXmlSchemaCollection();
    }

    /**
     * Transform x-definition tree to xsd schema via treeAdapter
     * @param treeAdapter   transformation algorithm
     */
    private void transformXdef(final XD2XsdTreeAdapter treeAdapter) {
        XsdLogger.printP(LOG_INFO, TRANSFORMATION, xDefinition, "*** Transformation of x-definition tree ***");

        final Set<String> rootNodeNames = adapterCtx.getSchemaRootNodeNames(xDefinition.getName());

        if (rootNodeNames != null) {
            for (XElement elem : xDefinition.getXElements()) {
                if (rootNodeNames.contains(elem.getName())) {
                    treeAdapter.convertTree(elem);
                    XsdLogger.printP(LOG_INFO, TRANSFORMATION, elem, "Adding root element to schema. Element=" + elem.getName());
                }
            }
        }
    }

    /**
     * Creates and initialize XSD schema
     */
    private XmlSchema createXsdSchema() {
        Pair<String, String> targetNamespace = XsdNamespaceUtils.getSchemaTargetNamespace(xDefinition);

        XsdLogger.printP(LOG_INFO, INITIALIZATION, xDefinition, "Creating XSD schema. " +
                "systemName=" + xDefinition.getName() + ", targetNamespacePrefix=" + targetNamespace.getKey() + ", targetNamespaceUri=" + targetNamespace.getValue());

        XsdSchemaFactory schemaFactory = new XsdSchemaFactory(adapterCtx);
        return schemaFactory.createXsdSchema(xDefinition, targetNamespace);
    }

}
