package io.kodular.android.manifest.elements;

import io.kodular.android.manifest.utils.XmlString;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

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

        attributes.forEach(element::setAttribute);

        children.forEach(c -> element.appendChild(c.getElement(document)));

//        FOR DEBUGGING, UNCOMMENT THE FOLLOWING TWO LINES
//        attributes.forEach((a, b) -> System.out.printf("(%s) %s = %s\n", tagName, a, b));
//        children.forEach(c -> System.out.printf("(%s) %s\n", tagName, c.toXml(document)));

        return element;
    }
}
