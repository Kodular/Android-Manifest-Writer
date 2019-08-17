package io.kodular.android.manifest.elements;

public class Provider extends BaseElement {
    public Provider() {
        super("provider");
    }

    public Provider addMetaData(MetaData metaData) {
        addChild(metaData);
        return this;
    }

    public Provider setName(String name) {
        addAttribute("android:name", name);
        return this;
    }

    public Provider setExported(boolean exported) {
        addAttribute("android:exported", String.valueOf(exported));
        return this;
    }

    public Provider setGrantUriPermissions(boolean grantUriPermissions) {
        addAttribute("android:grantUriPermissions", String.valueOf(grantUriPermissions));
        return this;
    }

    public Provider setAuthorities(String authorities) {
        addAttribute("android:authorities", authorities);
        return this;
    }

    public Provider setInitOrder(String initOrder) {
        addAttribute("android:initOrder", initOrder);
        return this;
    }
}
