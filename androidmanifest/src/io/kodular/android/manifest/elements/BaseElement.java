package io.kodular.android.manifest.elements;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.HashMap;

abstract class BaseElement
{
    final HashMap<String, String> properties = new HashMap<>();
    private String tagName;

    BaseElement(String tagName)
    {
        this.tagName = tagName;
    }

    public void setName(String name)
    {
        properties.put("android:name", name);
    }

    public void setCustomAttr(String name, String value)
    {
        properties.put(name, value);
    }

    public Element toXML(Document document)
    {
        Element element = document.createElement(tagName);
        for (HashMap.Entry<String, String> property : properties.entrySet())
        {
            element.setAttribute(property.getKey(), property.getValue());
        }

        return element;
    }
}
