package io.kodular.android.manifest;

import javax.xml.bind.annotation.XmlAttribute;

import static io.kodular.android.manifest.Constants.ANDROID_NS;

public class Category {
    @XmlAttribute(namespace = ANDROID_NS, required = true)
    public String name;

    public Category withName(String name) {
        this.name = name;
        return this;
    }
}
