package io.kodular.android.manifest.elements;

public class Provider extends BaseElement {
    public Provider() {
        super("provider");
    }

    public void addMetaData(MetaData metaData) {
        addChild(metaData);
    }

    public void setExported(boolean exported) {
        addAttribute("android:exported", String.valueOf(exported));
    }

    public void setGrantUriPermissions(boolean grantUriPermissions) {
        addAttribute("android:grantUriPermissions", String.valueOf(grantUriPermissions));
    }

    public void setAuthorities(String authorities) {
        addAttribute("android:authorities", authorities);
    }

    public void setInitOrder(String initOrder) {
        addAttribute("android:permission", initOrder);
    }
}
