package io.kodular.android.manifest;

import javax.xml.bind.annotation.XmlAttribute;

import static io.kodular.android.manifest.Constants.ANDROID_NS;

public class Permission {
    @XmlAttribute(namespace = ANDROID_NS, required = true)
    public String name;
    @XmlAttribute(namespace = ANDROID_NS)
    public String description;
    @XmlAttribute(namespace = ANDROID_NS)
    public String icon;
    @XmlAttribute(namespace = ANDROID_NS)
    public String label;
    @XmlAttribute(namespace = ANDROID_NS)
    public String permissionGroup;
    @XmlAttribute(namespace = ANDROID_NS)
    public ProtectionLevel protectionLevel;

    public Permission withName(String name) {
        this.name = name;
        return this;
    }

    public Permission withDescription(String description) {
        this.description = description;
        return this;
    }

    public Permission withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public Permission withLabel(String label) {
        this.label = label;
        return this;
    }

    public Permission withPermissionGroup(String permissionGroup) {
        this.permissionGroup = permissionGroup;
        return this;
    }

    public Permission withProtectionLevel(ProtectionLevel protectionLevel) {
        this.protectionLevel = protectionLevel;
        return this;
    }

    public enum ProtectionLevel {
        normal,
        dangerous,
        signature
    }
}
