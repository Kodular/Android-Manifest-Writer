package io.kodular.android.manifest.elements;

public class Permission extends BaseElement {

    public Permission() {
        super("permission");
    }

    public void setDescription(String description) {
        addAttribute("android:description", description);
    }

    public void setIcon(String icon) {
        addAttribute("android:icon", icon);
    }

    public void setLabel(String label) {
        addAttribute("android:label", label);
    }

    public void setPermissionGroup(String permissionGroup) {
        addAttribute("android:permissionGroup", permissionGroup);
    }

    public void setProtectionLevel(ProtectionLevel protectionLevel) {
        addAttribute("android:protectionLevel", protectionLevel.toString().toLowerCase());
    }

    enum ProtectionLevel {
        NORMAL,
        DANGEROUS,
        SIGNATURE
    }
}
