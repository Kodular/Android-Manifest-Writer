package io.kodular.android.manifest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import static io.kodular.android.manifest.Constants.ANDROID_NS;

@XmlRootElement(name = "uses-library")
public class UsesLibrary {
    @XmlAttribute(namespace = ANDROID_NS, required = true)
    public String name;
    @XmlAttribute(namespace = ANDROID_NS)
    public boolean required = true;

    public UsesLibrary withName(String name) {
        this.name = name;
        return this;
    }

    public UsesLibrary withRequired(boolean required) {
        this.required = required;
        return this;
    }
}
