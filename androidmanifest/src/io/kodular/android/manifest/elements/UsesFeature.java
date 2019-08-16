package io.kodular.android.manifest.elements;

public class UsesFeature extends BaseElement {
    public UsesFeature() {
        super("uses-feature");
    }

    public UsesFeature(String name) {
        super("uses-feature");
        addAttribute("android:name", name);
    }

    public UsesFeature setRequired(boolean required) {
        addAttribute("android:required", String.valueOf(required));
        return this;
    }

    public UsesFeature setGlEsVersion(String glEsVersion) {
        addAttribute("android:glEsVersion", glEsVersion);
        return this;
    }
}
