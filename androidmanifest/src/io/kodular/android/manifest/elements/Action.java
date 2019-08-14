package io.kodular.android.manifest.elements;

/**
 * See https://developer.android.com/guide/topics/manifest/action-element
 */
public class Action extends BaseElement {
    public Action(String name) {
        super("action");

        addAttribute("android:name", name.startsWith("ACTION_") ? "android.intent.action." + name.substring("ACTION_".length()) : name);
    }
}
