package io.kodular.android.manifest.elements;

public class UsesPermission extends BaseElement {
    public UsesPermission() {
        super("uses-permission");
    }

    public void setMaxSdkVersion(String maxSdkVersion) {
        addAttribute("android:maxSdkVersion", maxSdkVersion);
    }
}
