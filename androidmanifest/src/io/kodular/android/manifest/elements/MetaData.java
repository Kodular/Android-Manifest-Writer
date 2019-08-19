package io.kodular.android.manifest.elements;

public class MetaData extends BaseElement {

    public MetaData(String name, String value) {
        super("meta-data");
        setName(name);
        setValue(value);
    }

    public MetaData setName(String name) {
        addAttribute("android:name", name);
        return this;
    }

    public MetaData setValue(String value) {
        addAttribute("android:value", value);
        return this;
    }

    public MetaData setResource(String resource) {
        addAttribute("android:resource", resource);
        return this;
    }
}
