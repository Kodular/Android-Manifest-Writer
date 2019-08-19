package io.kodular.android.manifest.elements;

public class UsesLibrary extends BaseElement {
    public UsesLibrary() {
        super("uses-library");
    }

    public UsesLibrary setName(String name) {
        addAttribute("android:name", name);
        return this;
    }

    public UsesLibrary setRequired(boolean required) {
        addAttribute("android:required", String.valueOf(required));
        return this;
    }
}
