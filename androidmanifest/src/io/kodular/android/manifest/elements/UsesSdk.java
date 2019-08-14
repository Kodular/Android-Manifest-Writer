package io.kodular.android.manifest.elements;

public class UsesSdk extends BaseElement {
    public UsesSdk() {
        super("uses-sdk");
    }

    public UsesSdk setMinSdkVersion(int minSdkVersion) {
        addAttribute("android:minSdkVersion", String.valueOf(minSdkVersion));
        return this;
    }

    public UsesSdk setTargetSdkVersion(int targetSdkVersion) {
        addAttribute("android:targetSdkVersion", String.valueOf(targetSdkVersion));
        return this;
    }

    public UsesSdk setMaxSdkVersion(int maxSdkVersion) {
        addAttribute("android:maxSdkVersion", String.valueOf(maxSdkVersion));
        return this;
    }
}
