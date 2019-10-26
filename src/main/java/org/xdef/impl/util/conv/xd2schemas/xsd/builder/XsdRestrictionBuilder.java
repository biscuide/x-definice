package org.xdef.impl.util.conv.xd2schemas.xsd.builder;

import javafx.util.Pair;
import org.apache.ws.commons.schema.*;
import org.xdef.XDNamedValue;
import org.xdef.impl.XData;
import org.xdef.impl.util.conv.xd2schemas.xsd.builder.facet.AbstractXsdFacetBuilder;
import org.xdef.impl.util.conv.xd2schemas.xsd.builder.facet.IXsdFacetBuilder;
import org.xdef.impl.util.conv.xd2schemas.xsd.builder.facet.DefaultFacetBuilder;
import org.xdef.impl.util.conv.xd2schemas.xsd.util.XD2XsdUtils;
import org.xdef.impl.util.conv.xd2schemas.xsd.util.XsdLogger;

import javax.xml.namespace.QName;

import java.util.List;

import static org.xdef.impl.util.conv.xd2schemas.xsd.util.XsdLoggerDefs.*;

public class XsdRestrictionBuilder {

    private final int logLevel;
    private final XData xData;
    private final String parserName;
    private XDNamedValue[] parameters = null;

    public XsdRestrictionBuilder(XData xData, int logLevel) {
        this.xData = xData;
        this.logLevel = logLevel;
        this.parserName = xData.getParserName();
    }

    public void setParameters(XDNamedValue[] parameters) {
        this.parameters = parameters;
    }

    public XmlSchemaSimpleTypeRestriction buildRestriction() {
        if (XsdLogger.isInfo(logLevel)) {
            XsdLogger.printP(INFO, TRANSFORMATION, xData, "Creating restrictions of simple content ...");
        }

        XmlSchemaSimpleTypeRestriction restriction = null;

        boolean customParser = true;
        Pair<QName, IXsdFacetBuilder> parserInfo = XD2XsdUtils.getCustomFacetBuilder(parserName, parameters);
        if (parserInfo == null) {
            parserInfo = XD2XsdUtils.getDefaultFacetBuilder(parserName);
            if (parserInfo != null) {
                customParser = false;
                if (XsdLogger.isDebug(logLevel)) {
                    XsdLogger.printP(DEBUG, TRANSFORMATION, xData, "Default facet builder will be used");
                }
            }
        } else {
            if (XsdLogger.isDebug(logLevel)) {
                XsdLogger.printP(DEBUG, TRANSFORMATION, xData, "Custom facet builder will be used");
            }
        }

        if (parserInfo != null) {
            restriction = simpleTypeRestriction(parserInfo.getKey(), parserInfo.getValue());
        }

        if (restriction == null) {
            throw new RuntimeException("Unknown reference type parser: " + parserName);
        }

        if (customParser) {
            restriction.setAnnotation(XsdElementBuilder.createAnnotation("Original x-definition parser: " + parserName));
        }

        return restriction;
    }

    public XmlSchemaSimpleTypeRestriction buildDefaultRestriction(final QName qName) {
        if (XsdLogger.isInfo(logLevel)) {
            XsdLogger.printP(INFO, TRANSFORMATION, xData, "Creating restrictions of simple content (default facet builder will be used) ...");
        }

        return simpleTypeRestriction(qName, new DefaultFacetBuilder());
    }

    private XmlSchemaSimpleTypeRestriction simpleTypeRestriction(final QName qName, final IXsdFacetBuilder facetBuilder) {
        if (XsdLogger.isInfo(logLevel)) {
            XsdLogger.printP(INFO, TRANSFORMATION, xData, "Creating simple type restriction. QName=" + qName);
        }

        XmlSchemaSimpleTypeRestriction restriction = new XmlSchemaSimpleTypeRestriction();
        restriction.setBaseTypeName(qName);
        restriction.getFacets().addAll(buildFacets(qName, facetBuilder));
        return restriction;
    }

    private List<XmlSchemaFacet> buildFacets(final QName qName, final IXsdFacetBuilder facetBuilder) {
        if ("double".equals(qName.getLocalPart()) || "float".equals(qName.getLocalPart())) {
            facetBuilder.setValueType(IXsdFacetBuilder.ValueType.DECIMAL_FLOATING);
        } else if ("int".equals(qName.getLocalPart()) || "long".equals(qName.getLocalPart())) {
            facetBuilder.setValueType(IXsdFacetBuilder.ValueType.DECIMAL_INTEGER);
        } else {
            facetBuilder.setValueType(IXsdFacetBuilder.ValueType.STRING);
        }

        ((AbstractXsdFacetBuilder)facetBuilder).setLogLevel(logLevel);
        return facetBuilder.build(parameters);
    }

    /*
    public static List<XmlSchemaFacet> buildFacets(final String parserName, final XDNamedValue[] parameters) {
        List<XmlSchemaFacet> facets = null;

        Pair<QName, IXsdFacetBuilder> parserInfo = XD2XsdUtils.getCustomFacetBuilder(parserName, parameters);
        if (parserInfo == null) {
            parserInfo = XD2XsdUtils.getDefaultFacetBuilder(parserName);
        }

        if (parserInfo != null) {
            facets = buildFacets(parserInfo.getKey(), parserInfo.getValue(), parameters);
        }

        if (facets == null) {
            throw new RuntimeException("Unknown reference type parser: " + parserName);
        }

        return facets;
    }*/

}
