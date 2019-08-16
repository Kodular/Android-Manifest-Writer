package io.kodular.android.manifest.elements;

public class IntentFilter extends BaseElement {
    public IntentFilter() {
        super("intent-filter");
    }

    public IntentFilter addAction(Action action) {
        addChild(action);
        return this;
    }

    public IntentFilter addCategory(Category category) {
        addChild(category);
        return this;
    }

    public IntentFilter addData(Data data) {
        addChild(data);
        return this;
    }

    public IntentFilter setIcon(String icon) {
        addAttribute("android:icon", icon);
        return this;
    }

    public IntentFilter setLabel(String label) {
        addAttribute("android:label", label);
        return this;
    }

    public IntentFilter setPriority(String priority) {
        addAttribute("android:priority", priority);
        return this;
    }
}
