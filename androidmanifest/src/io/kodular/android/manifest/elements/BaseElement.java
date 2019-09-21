package io.kodular.android.manifest.elements;

import io.kodular.android.manifest.utils.XmlString;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseElement {
    private final Map<String, String> attributes = new HashMap<>();
    private final List<BaseElement> children = new ArrayList<>();
    private String tagName;

    public BaseElement(String tagName) {
        this.tagName = tagName;
    }

    protected void addAttribute(String key, String value) {
        attributes.put(key, value);
    }

    public void addAttribute(String key, boolean value) {
        attributes.put(key, String.valueOf(value));
    }

    public void addAttribute(String key, int value) {
        attributes.put(key, String.valueOf(value));
    }

    public void addChild(String xmlString) {
        addChild(XmlString.getElement(xmlString));
    }

    public <T extends BaseElement> void addChild(T element) {
        children.add(element);
    }

    Element getElement(Document document) {
        Element element = document.createElement(tagName);

        for (Map.Entry<String, String> entry : attributes.entrySet()) {
            element.setAttribute(entry.getKey(), entry.getValue());
        }

        for (BaseElement el : children) {
            element.appendChild(el.getElement(document));
        }

        return element;
    }

    public static String toXmlString(BaseElement el) {
        try {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

            doc.appendChild(el.getElement(doc));

            StringWriter sw = new StringWriter();

            Transformer transformer = TransformerFactory.newInstance().newTransformer();

            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

            transformer.transform(new DOMSource(doc), new StreamResult(sw));

            return sw.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error converting to String", e);
        }
    }
}
