package io.kodular.android.manifest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import static io.kodular.android.manifest.Constants.ANDROID_NS;

@XmlRootElement(name = "uses-feature")
public class UsesFeature {
    @XmlAttribute(namespace = ANDROID_NS)
    public String name;
    @XmlAttribute(namespace = ANDROID_NS)
    public boolean required = true;
    @XmlAttribute(namespace = ANDROID_NS)
    public String glEsVersion;

    public UsesFeature withName(String name) {
        this.name = name;
        return this;
    }

    public UsesFeature withRequired(boolean required) {
        this.required = required;
        return this;
    }

    public UsesFeature withGlEsVersion(String glEsVersion) {
        this.glEsVersion = glEsVersion;
        return this;
    }
}
