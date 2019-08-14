package io.kodular.android.manifest.elements;

public class IntentFilter extends BaseElement {
    public IntentFilter() {
        super("intent-filter");
    }

    public void addAction(Action action) {
        addChild(action);
    }

    public void addCategory(Category category) {
        addChild(category);
    }

    public void addData(Data data) {
        addChild(data);
    }

    public void setIcon(String icon) {
        addAttribute("android:icon", icon);
    }

    public void setLabel(String label) {
        addAttribute("android:label", label);
    }

    public void setPriority(String priority) {
        addAttribute("android:priority", priority);
    }
}
