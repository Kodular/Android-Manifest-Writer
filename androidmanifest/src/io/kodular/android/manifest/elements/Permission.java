package io.kodular.android.manifest.elements;

public class Permission extends BaseElement {

    public Permission() {
        super("permission");
    }

    public Permission(String name) {
        super("permission");
        addAttribute("android:name", name);
    }

    public Permission setDescription(String description) {
        addAttribute("android:description", description);
        return this;
    }

    public Permission setIcon(String icon) {
        addAttribute("android:icon", icon);
        return this;
    }

    public Permission setLabel(String label) {
        addAttribute("android:label", label);
        return this;
    }

    public Permission setPermissionGroup(String permissionGroup) {
        addAttribute("android:permissionGroup", permissionGroup);
        return this;
    }

    public Permission setProtectionLevel(ProtectionLevel protectionLevel) {
        addAttribute("android:protectionLevel", protectionLevel.toString().toLowerCase());
        return this;
    }

    enum ProtectionLevel {
        NORMAL,
        DANGEROUS,
        SIGNATURE
    }
}
