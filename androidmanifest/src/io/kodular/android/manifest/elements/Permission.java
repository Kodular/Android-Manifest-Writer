package io.kodular.android.manifest.elements;

public class Permission extends BaseElement {
    public static final String PROTECTION_NORMAL = "normal";
    public static final String PROTECTION_DANGEROUS = "dangerous";
    public static final String PROTECTION_SIGNATURE = "signature";

    public Permission() {
        super("permission");
    }

    public Permission(String permission) {
        super("permission");

        setName(permission);
    }

    public Permission(String permission, String protectionLevel) {
        super("permission");

        setName(permission);
        setProtectionLevel(protectionLevel);
    }

    public void setDescription(String description) {
        properties.put("android:description", description);
    }

    public void setIcon(String icon) {
        properties.put("android:icon", icon);
    }

    public void setLabel(String label) {
        properties.put("android:label", label);
    }

    public void setPermissionGroup(String permissionGroup) {
        properties.put("android:permissionGroup", permissionGroup);
    }

    public void setProtectionLevel(String protectionLevel) {
        properties.put("android:protectionLevel", protectionLevel);
    }
}
