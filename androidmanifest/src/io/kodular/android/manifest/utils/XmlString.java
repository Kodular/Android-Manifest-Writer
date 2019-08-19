package io.kodular.android.manifest.utils;

import io.kodular.android.manifest.elements.BaseElement;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class XmlString {
    public static BaseElement getElement(String xmlString) {
        try {
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

            Document document = builder.parse(new ByteArrayInputStream(xmlString.getBytes()));

            return getAnyElement(document.getDocumentElement());

        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    private static AnyElement getAnyElement(Element element) {
        AnyElement baseElement = new AnyElement(element.getTagName());

        NamedNodeMap attributes = element.getAttributes();

        for (int i = 0; i < attributes.getLength(); i++) {
            Node attribute = attributes.item(i);
            baseElement.addAttribute(attribute.getNodeName(), attribute.getNodeValue());
        }

        NodeList subElements = element.getChildNodes();
        for (int i = 0; i < subElements.getLength(); i++) {
            Node subNode = subElements.item(i);
            if (subNode instanceof Element) {
                Element subElement = (Element) subNode;
                baseElement.addChild(getAnyElement(subElement));
            }
        }

        return baseElement;
    }

    private static class AnyElement extends BaseElement {
        AnyElement(String tagName) {
            super(tagName);
        }
    }
}
