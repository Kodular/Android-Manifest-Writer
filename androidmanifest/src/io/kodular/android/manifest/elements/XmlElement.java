package io.kodular.android.manifest.elements;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public interface XmlElement {
    Element toXml(Document document);
}
