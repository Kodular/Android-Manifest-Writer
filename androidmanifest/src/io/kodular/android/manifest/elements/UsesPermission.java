package io.kodular.android.manifest.elements;

public class UsesPermission extends BaseElement {
    public UsesPermission(String name) {
        super("uses-permission");
        addAttribute("android:name", name);
    }

    public void setMaxSdkVersion(String maxSdkVersion) {
        addAttribute("android:maxSdkVersion", maxSdkVersion);
    }
}
