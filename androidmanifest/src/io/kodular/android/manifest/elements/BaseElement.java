package io.kodular.android.manifest.elements;

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

    public void addAttribute(String key, String value) {
        attributes.put(key, value);
    }

    public <T extends BaseElement> void addChild(T element) {
        children.add(element);
    }

    public Element getElement(Document document) {
        Element element = document.createElement(tagName);

        attributes.forEach(element::setAttribute);

        children.forEach(c -> element.appendChild(c.getElement(document)));

//        FOR DEBUGGING, UNCOMMENT THE FOLLOWING TWO LINES
//        attributes.forEach((a, b) -> System.out.printf("(%s) %s = %s\n", tagName, a, b));
//        children.forEach(c -> System.out.printf("(%s) %s\n", tagName, c.toXml(document)));

        return element;
    }
}
