package io.kodular.android.manifest.elements;

public class Receiver extends BaseElement {
    public Receiver() {
        super("receiver");
    }

    public Receiver addIntentFilter(IntentFilter intentFilter) {
        addChild(intentFilter);
        return this;
    }

    public Receiver addMetaData(MetaData metaData) {
        addChild(metaData);
        return this;
    }

    public Receiver setDirectBootAware(boolean directBootAware) {
        addAttribute("android:directBootAware", String.valueOf(directBootAware));
        return this;
    }

    public Receiver setName(String name) {
        addAttribute("android:name", name);
        return this;
    }

    public Receiver setEnabled(boolean enabled) {
        addAttribute("android:enabled", String.valueOf(enabled));
        return this;
    }

    public Receiver setExported(boolean exported) {
        addAttribute("android:exported", String.valueOf(exported));
        return this;
    }

    public Receiver setIcon(String icon) {
        addAttribute("android:icon", icon);
        return this;
    }

    public Receiver setLabel(String label) {
        addAttribute("android:label", label);
        return this;
    }

    public Receiver setPermission(String permission) {
        addAttribute("android:permission", permission);
        return this;
    }

    public Receiver setProcess(String process) {
        addAttribute("android:process", process);
        return this;
    }
}
