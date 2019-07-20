package io.kodular.android.manifest.elements;

public class UsesLibrary extends BaseElement {
    public UsesLibrary() {
        super("uses-feature");
    }

    public UsesLibrary(String library) {
        super("uses-library");

        setName(library);
    }

    public UsesLibrary(String library, boolean required) {
        super("uses-library");

        setName(library);
        setRequired(required);
    }

    public void setRequired(boolean required) {
        properties.put("android:required", required ? "true" : "false");
    }
}
