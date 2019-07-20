package io.kodular.android.manifest.elements;

public class UsesFeature extends BaseElement {
    public UsesFeature() {
        super("uses-feature");
    }

    public UsesFeature(String feature) {
        super("uses-feature");

        setName(feature);
    }

    public UsesFeature(String feature, boolean required) {
        super("uses-feature");

        setName(feature);
        setRequired(required);
    }

    public void setRequired(boolean required) {
        properties.put("android:required", required ? "true" : "false");
    }

    public void setGlEsVersion(String glEsVersion) {
        properties.put("android:glEsVersion", glEsVersion);
    }
}
