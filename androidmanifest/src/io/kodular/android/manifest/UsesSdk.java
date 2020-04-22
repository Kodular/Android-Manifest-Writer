package io.kodular.android.manifest;

import javax.xml.bind.annotation.*;

import static io.kodular.android.manifest.Constants.ANDROID_NS;

public class UsesSdk {
    @XmlAttribute(namespace = ANDROID_NS)
    public int minSdkVersion;
    @XmlAttribute(namespace = ANDROID_NS)
    public int targetSdkVersion;

    public UsesSdk withMinSdkVersion(int minSdkVersion) {
        this.minSdkVersion = minSdkVersion;
        return this;
    }

    public UsesSdk withTargetSdkVersion(int targetSdkVersion) {
        this.targetSdkVersion = targetSdkVersion;
        return this;
    }
}
