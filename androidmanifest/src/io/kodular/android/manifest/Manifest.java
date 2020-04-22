package io.kodular.android.manifest;

import javax.xml.bind.annotation.*;

import static io.kodular.android.manifest.Constants.ANDROID_NS;

@XmlRootElement
public class Manifest {
    @XmlAttribute(required = true)
    public String packageName;
    @XmlAttribute(namespace = ANDROID_NS)
    public int versionCode;
    @XmlAttribute(namespace = ANDROID_NS)
    public String versionName;
    @XmlAttribute(namespace = ANDROID_NS)
    public String installLocation = "auto";

    @XmlElement(name = "uses-sdk")
    public UsesSdk usesSdk;
    @XmlElement
    public Application application;

//    private UsesSdk usesSdk;
//    private Application application;
//    private Permission permission;
//    private UsesFeature usesFeature;
//    private UsesPermission usesPermission;

//    public void setUsesSdk(UsesSdk usesSdk) {
//        this.usesSdk = usesSdk;
//    }
//
//    public void setApplication(Application application) {
//        this.application = application;
//    }
//
//    public void addPermission(Permission permission) {
//        this.permission = permission;
//    }
//
//    public void addUsesFeature(UsesFeature usesFeature) {
//        this.usesFeature = usesFeature;
//    }
//
//    public void addUsesPermission(UsesPermission usesPermission) {
//        this.usesPermission = usesPermission;
//    }

    public Manifest withPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public Manifest withVersionCode(int versionCode) {
        this.versionCode = versionCode;
        return this;
    }

    public Manifest withVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }

    public Manifest withApplication(Application application) {
        this.application = application;
        return this;
    }

    public Manifest withUsesSdk(UsesSdk usesSdk) {
        this.usesSdk = usesSdk;
        return this;
    }
}
