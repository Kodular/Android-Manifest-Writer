package io.kodular.android.manifest.elements;

public class Receiver extends BaseElement {
    public Receiver() {
        super("receiver");
    }

    public void addIntentFilter(IntentFilter intentFilter) {
        addChild(intentFilter);
    }

    public void addMetaData(MetaData metaData) {
        addChild(metaData);
    }

    public void setDirectBootAware(boolean directBootAware) {
        addAttribute("android:directBootAware", String.valueOf(directBootAware));
    }

    public void setEnabled(boolean enabled) {
        addAttribute("android:enabled", String.valueOf(enabled));
    }

    public void setExported(boolean exported) {
        addAttribute("android:exported", String.valueOf(exported));
    }

    public void setIcon(String icon) {
        addAttribute("android:icon", icon);
    }

    public void setLabel(String label) {
        addAttribute("android:label", label);
    }

    public void setPermission(String permission) {
        addAttribute("android:permission", permission);
    }

    public void setProcess(String process) {
        addAttribute("android:process", process);
    }
}
