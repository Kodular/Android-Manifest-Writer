package io.kodular.android.manifest.elements;

public class UsesPermission extends BaseElement {
    public UsesPermission() {
        super("uses-permission");
    }

    public UsesPermission(String name) {
        super("uses-permission");
        addAttribute("android:name", name);
    }

    public UsesPermission setMaxSdkVersion(String maxSdkVersion) {
        addAttribute("android:maxSdkVersion", maxSdkVersion);
        return this;
    }
}
