package io.kodular.android.manifest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import static io.kodular.android.manifest.Constants.ANDROID_NS;

@XmlRootElement(name = "meta-data")
public class MetaData {
    @XmlAttribute(namespace = ANDROID_NS, required = true)
    public String name;
    @XmlAttribute(namespace = ANDROID_NS)
    public String value;
    @XmlAttribute(namespace = ANDROID_NS)
    public String resource;

    public MetaData withName(String name) {
        this.name = name;
        return this;
    }

    public MetaData withValue(String value) {
        this.value = value;
        return this;
    }

    public MetaData withResource(String resource) {
        this.resource = resource;
        return this;
    }
}
