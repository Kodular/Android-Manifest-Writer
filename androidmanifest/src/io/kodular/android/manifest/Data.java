package io.kodular.android.manifest;

import javax.xml.bind.annotation.XmlAttribute;

import static io.kodular.android.manifest.Constants.ANDROID_NS;

public class Data {
    @XmlAttribute(namespace = ANDROID_NS)
    public String scheme;
    @XmlAttribute(namespace = ANDROID_NS)
    public String host;
    @XmlAttribute(namespace = ANDROID_NS)
    public String port;
    @XmlAttribute(namespace = ANDROID_NS)
    public String path;
    @XmlAttribute(namespace = ANDROID_NS)
    public String pathPrefix;
    @XmlAttribute(namespace = ANDROID_NS)
    public String pathPattern;
    @XmlAttribute(namespace = ANDROID_NS)
    public String mimeType;

    public Data withScheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    public Data withHost(String host) {
        this.host = host;
        return this;
    }

    public Data withPort(String port) {
        this.port = port;
        return this;
    }

    public Data withPath(String path) {
        this.path = path;
        return this;
    }

    public Data withPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
        return this;
    }

    public Data withPathPattern(String pathPattern) {
        this.pathPattern = pathPattern;
        return this;
    }

    public Data withMimeType(String mimeType) {
        this.mimeType = mimeType;
        return this;
    }
}
