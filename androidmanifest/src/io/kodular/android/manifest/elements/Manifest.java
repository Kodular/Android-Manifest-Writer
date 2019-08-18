package io.kodular.android.manifest.elements;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

public class Manifest extends BaseElement {
    private Application application;
    private UsesSdk usesSdk;

    private List<Permission> permissions = new ArrayList<>();
    private List<UsesFeature> usesFeatures = new ArrayList<>();
    private List<UsesPermission> usesPermissions = new ArrayList<>();

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
        this.usesSdk = usesSdk;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public void addPermission(Permission permission) {
        permissions.add(permission);
    }

    public void addUsesFeature(UsesFeature usesFeature) {
        usesFeatures.add(usesFeature);
    }

    public void addUsesPermission(UsesPermission usesPermission) {
        usesPermissions.add(usesPermission);
    }

    @Override
    public Element getElement(Document document) {
        Element element = super.getElement(document);

        permissions.stream().map(permission -> permission.getElement(document)).forEach(element::appendChild);
        usesPermissions.stream().map(usesPermission -> usesPermission.getElement(document)).forEach(element::appendChild);
        usesFeatures.stream().map(usesFeature -> usesFeature.getElement(document)).forEach(element::appendChild);

        element.appendChild(usesSdk.getElement(document));
        element.appendChild(application.getElement(document));

        return element;
    }
}
