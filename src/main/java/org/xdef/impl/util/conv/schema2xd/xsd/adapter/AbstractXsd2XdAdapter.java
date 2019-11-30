package org.xdef.impl.util.conv.schema2xd.xsd.adapter;

import org.xdef.impl.util.conv.schema2xd.xsd.definition.Xsd2XdFeature;
import org.xdef.impl.util.conv.schema2xd.xsd.model.XdAdapterCtx;
import org.xdef.impl.util.conv.xd2schema.xsd.model.XsdAdapterCtx;

import java.util.HashSet;
import java.util.Set;

public class AbstractXsd2XdAdapter {

    /**
     * Adapter context
     */
    protected XdAdapterCtx adapterCtx = null;

    /**
     * Enabled algorithm features
     */
    protected Set<Xsd2XdFeature> features = new HashSet<Xsd2XdFeature>();

    /**
     * Set features which should be enabled by transformation algorithm
     * @param features
     */
    public void setFeatures(Set<Xsd2XdFeature> features) {
        this.features = features;
    }

    /**
     * Add feature which should be enabled by transformation algorithm
     * @param feature
     */
    public void addFeature(Xsd2XdFeature feature) {
        features.add(feature);
    }

}