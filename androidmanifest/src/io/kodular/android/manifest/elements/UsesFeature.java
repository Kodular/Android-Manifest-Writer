package io.kodular.android.manifest.elements;

public class UsesFeature extends BaseElement {
    public UsesFeature() {
        super("uses-feature");
    }

    public void setRequired(boolean required) {
        addAttribute("android:required", String.valueOf(required));
    }

    public void setGlEsVersion(String glEsVersion) {
        addAttribute("android:glEsVersion", glEsVersion);
    }
}
