package io.kodular.android.manifest.elements;

public class Manifest extends BaseElement {
    public Manifest(String packageName, String versionCode, String versionName) {
        super("manifest");

        addAttribute("xmlns:android", "http://schemas.android.com/apk/res/android");
        addAttribute("xmlns:tools", "http://schemas.android.com/tools");
        addAttribute("package", packageName);
        addAttribute("android:versionCode", versionCode);
        addAttribute("android:versionName", versionName);
        addAttribute("android:installLocation", "auto");
    }

    public void setUsesSdk(UsesSdk usesSdk) {
        addChild(usesSdk);
    }

    public void setApplication(Application application) {
        addChild(application);
    }

    public void addPermission(Permission permission) {
        addChild(permission);
    }

    public void addUsesFeature(UsesFeature usesFeature) {
        addChild(usesFeature);
    }

    public void addUsesPermission(UsesPermission usesPermission) {
        addChild(usesPermission);
    }
}
