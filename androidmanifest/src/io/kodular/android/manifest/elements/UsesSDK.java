package io.kodular.android.manifest.elements;

public class UsesSDK extends BaseElement {
    public UsesSDK() {
        super("uses-sdk");
    }

    public void setMinSdkVersion(String minSdkVersion) {
        addAttribute("android:minSdkVersion", minSdkVersion);
    }

    public void setTargetSdkVersion(String targetSdkVersion) {
        addAttribute("android:targetSdkVersion", targetSdkVersion);
    }

    public void setMaxSdkVersion(String maxSdkVersion) {
        addAttribute("android:maxSdkVersion", maxSdkVersion);
    }
}
