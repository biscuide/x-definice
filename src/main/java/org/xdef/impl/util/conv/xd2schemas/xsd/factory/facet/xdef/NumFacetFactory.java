package org.xdef.impl.util.conv.xd2schemas.xsd.factory.facet.xdef;

import org.apache.ws.commons.schema.XmlSchemaFacet;
import org.xdef.XDNamedValue;
import org.xdef.impl.util.conv.xd2schemas.xsd.factory.facet.DefaultFacetFactory;

import java.util.List;

public class NumFacetFactory extends DefaultFacetFactory {

    @Override
    public void extraFacets(final List<XmlSchemaFacet> facets, final XDNamedValue[] params) {
        facets.add(pattern("([0-9])*"));
    }
}