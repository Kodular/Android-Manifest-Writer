package io.kodular.android.manifest.elements;

public class UsesPermission extends BaseElement {
    public UsesPermission(String permission) {
        super("uses-permission");

        setName(permission);
    }

    public void setMaxSdkVersion(String maxSdkVersion) {
        properties.put("android:maxSdkVersion", maxSdkVersion);
    }
}
