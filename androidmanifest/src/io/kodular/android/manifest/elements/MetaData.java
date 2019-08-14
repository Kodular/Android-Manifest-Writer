package io.kodular.android.manifest.elements;

public class MetaData extends BaseElement {
    public MetaData() {
        super("meta-data");
    }

    public MetaData(String name, String value) {
        super("meta-data");
        setName(name);
        setValue(value);
    }

    public void setName(String name) {
        addAttribute("android:name", name);
    }

    public void setValue(String value) {
        addAttribute("android:value", value);
    }

    public void setResource(String resource) {
        addAttribute("android:resource", resource);
    }
}
