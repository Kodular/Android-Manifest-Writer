package io.kodular.android.manifest.elements;

public class Category extends BaseElement {
    public Category(String name) {
        super("category");
        addAttribute("android:name", name);
    }
}
