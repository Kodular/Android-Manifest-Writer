package io.kodular.android.manifest.elements;

public class Service extends BaseElement {
    public Service() {
        super("service");
    }

    public Service addIntentFilter(IntentFilter intentFilter) {
        addChild(intentFilter);
        return this;
    }

    public Service addMetaData(MetaData metaData) {
        addChild(metaData);
        return this;
    }

    public Service setName(String name) {
        addAttribute("android:name", name);
        return this;
    }

    public Service setDescription(String description) {
        addAttribute("android:description", description);
        return this;
    }

    public Service setDirectBootAware(boolean directBootAware) {
        addAttribute("android:directBootAware", String.valueOf(directBootAware));
        return this;
    }

    public Service setEnabled(boolean enabled) {
        addAttribute("android:enabled", String.valueOf(enabled));
        return this;
    }

    public Service setExported(boolean exported) {
        addAttribute("android:exported", String.valueOf(exported));
        return this;
    }

    public Service setIcon(String icon) {
        addAttribute("android:icon", icon);
        return this;
    }

    public Service setIsolatedProcess(boolean isolatedProcess) {
        addAttribute("android:isolatedProcess", String.valueOf(isolatedProcess));
        return this;
    }

    public Service setLabel(String label) {
        addAttribute("android:label", label);
        return this;
    }

    public Service setPermission(String permission) {
        addAttribute("android:permission", permission);
        return this;
    }

    public Service setProcess(String process) {
        addAttribute("android:process", process);
        return this;
    }

    public Service setStopWithTask(boolean stopWithTask) {
        addAttribute("android:process", String.valueOf(stopWithTask));
        return this;
    }
}
