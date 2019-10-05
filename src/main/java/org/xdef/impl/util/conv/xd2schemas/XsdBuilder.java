package org.xdef.impl.util.conv.xd2schemas;

import org.apache.ws.commons.schema.*;
import org.xdef.XDParser;
import org.xdef.XDValue;
import org.xdef.impl.XElement;
import org.xdef.impl.XNode;
import org.xdef.model.XMData;
import org.xdef.model.XMOccurrence;

import javax.xml.namespace.QName;
import java.security.InvalidParameterException;

public class XsdBuilder {

    private final XmlSchema schema;

    public XsdBuilder(XmlSchema schema) {
        this.schema = schema;
    }

    public void addElement(final XmlSchemaElement element) {
        schema.getItems().add(element);
    }

    public void addComplexType(final XmlSchemaComplexType complexType) {
        schema.getItems().add(complexType);
    }

    /**
     * Create named xsd element
     * Example: <element name="elem_name">
     */
    public XmlSchemaElement createElement(final String name, final XElement xElement) {
        XmlSchemaElement elem = new XmlSchemaElement(schema, false);
        int namespacePrefixPos = name.indexOf(':');
        elem.setName(namespacePrefixPos == -1 ? name : name.substring(namespacePrefixPos + 1));
        elem.setMinOccurs(xElement.getOccurence().minOccurs());
        elem.setMaxOccurs((xElement.isUnbounded() || xElement.isMaxUnlimited()) ? Long.MAX_VALUE : xElement.getOccurence().maxOccurs());
        return elem;
    }

    /**
     * Create complexType element
     * Output: <complexType>
     */
    public XmlSchemaComplexType createComplexType() {
        return new XmlSchemaComplexType(schema, false);
    }

    public XmlSchemaAttribute createAttribute(final String name, final XMData xmData) {
        XmlSchemaAttribute attr = new XmlSchemaAttribute(schema, false);
        attr.setName(name);
        if (xmData.isOptional() || xmData.getOccurence().isOptional()) {
            attr.setUse(XmlSchemaUse.OPTIONAL);
        } else if (xmData.isRequired() || xmData.getOccurence().isRequired()) {
            attr.setUse(XmlSchemaUse.REQUIRED);
        }

        // TODO: Handling of reference namespaces?
        if (xmData.getRefTypeName() != null) {
            attr.setSchemaTypeName(new QName("", xmData.getRefTypeName()));
        } else {
            attr.setSchemaTypeName(XD2XsdUtils.parserNameToQName(xmData.getValueTypeName()));
        }

        return attr;
    }

    public XmlSchemaSimpleContent createSimpleContent(final XMData xmData) {
        XmlSchemaSimpleContent content = new XmlSchemaSimpleContent();
        XmlSchemaSimpleContentExtension contentExtension = new XmlSchemaSimpleContentExtension();

        final String parserName = xmData.getParserName();
        XDValue parseMethod = xmData.getParseMethod();
        // TODO: Has to be instance of XDParser?
        if (parseMethod instanceof XDParser) {
            contentExtension.setBaseTypeName(XD2XsdUtils.parserNameToQName(parserName));
        }

        content.setContent(contentExtension);
        return content;
    }

    /**
     *
     * @param groupType
     * @return
     */
    public XmlSchemaGroupParticle createGroup(short groupType, final XMOccurrence occurrence) {
        XmlSchemaGroupParticle particle = null;
        switch (groupType) {
            case XNode.XMSEQUENCE: {
                particle = new XmlSchemaSequence();
                break;
            }
            case XNode.XMMIXED: {
                particle = new XmlSchemaAll();
                break;
            }
            case XNode.XMCHOICE: {
                particle = new XmlSchemaChoice();
                break;
            }
            default: {
                throw new InvalidParameterException("Unknown groupType");
            }
        }

        particle.setMinOccurs(occurrence.minOccurs());
        particle.setMaxOccurs((occurrence.isUnbounded() || occurrence.isMaxUnlimited()) ? Long.MAX_VALUE : occurrence.maxOccurs());

        return particle;
    }
}