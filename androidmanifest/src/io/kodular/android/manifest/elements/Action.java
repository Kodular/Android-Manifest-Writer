package io.kodular.android.manifest.elements;

public class Action extends BaseElement {
    public Action() {
        super("action");
    }

    public Action(String name) {
        super("action");
        setName(name);
    }

    public void setName(String name) {
        addAttribute("android:name", name);
    }
}
