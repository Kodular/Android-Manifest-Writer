package io.kodular.android.manifest.elements;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Activity extends BaseElement {
    public Activity() {
        super("activity");
    }

    public void setName(String name) {
        addAttribute("android:name", name);
    }

    public Activity setConfigChanges(ConfigChanges... configChanges) {
        addAttribute("android:configChanges", Arrays.stream(configChanges).map(ConfigChanges::name).collect(Collectors.joining("|")));
        return this;
    }

    public Activity setExcludeFromRecents(boolean excludeFromRecents) {
        addAttribute("android:excludeFromRecents", String.valueOf(excludeFromRecents));
        return this;
    }

    public void setExported(boolean exported) {
        addAttribute("android:exported", String.valueOf(exported));
    }

    public void setHardwareAccelerated(boolean hardwareAccelerated) {
        addAttribute("android:hardwareAccelerated", String.valueOf(hardwareAccelerated));
    }

    public void setLaunchMode(String launchMode) {
        addAttribute("android:launchMode", launchMode);
    }

    public void setPermission(String permission) {
        addAttribute("android:permission", permission);
    }

    public void setTheme(String theme) {
        addAttribute("android:theme", theme);
    }

    public void addIntentFilter(IntentFilter intentFilter) {
        addChild(intentFilter);
    }

    public void addMetaData(MetaData metaData) {
        addChild(metaData);
    }

    public enum ConfigChanges {
        mcc, mnc, locale, touchscreen, keyboard, keyboardHidden, navigation, screenLayout, fontScale, uiMode,
        orientation, density, screenSize, smallestScreenSize
    }
}

