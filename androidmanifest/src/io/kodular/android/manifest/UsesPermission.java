package io.kodular.android.manifest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import static io.kodular.android.manifest.Constants.ANDROID_NS;

@XmlRootElement(name = "uses-permission")
public class UsesPermission {
    @XmlAttribute(namespace = ANDROID_NS, required = true)
    public String name;
    @XmlAttribute(namespace = ANDROID_NS)
    public int maxSdkVersion;

    public UsesPermission setMaxSdkVersion(int maxSdkVersion) {
        this.maxSdkVersion = maxSdkVersion;
        return this;
    }
}
