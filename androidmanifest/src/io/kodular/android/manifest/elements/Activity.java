package io.kodular.android.manifest.elements;

import io.kodular.android.manifest.utils.Util;

public class Activity extends BaseElement {
    public Activity() {
        super("activity");
    }

    public Activity setName(String name) {
        addAttribute("android:name", name);
        return this;
    }

    public Activity setConfigChanges(ConfigChanges... configChanges) {
        addAttribute("android:configChanges", Util.join("|", configChanges));
        return this;
    }

    public Activity setExcludeFromRecents(boolean excludeFromRecents) {
        addAttribute("android:excludeFromRecents", String.valueOf(excludeFromRecents));
        return this;
    }

    public Activity setExported(boolean exported) {
        addAttribute("android:exported", String.valueOf(exported));
        return this;
    }

    public Activity setHardwareAccelerated(boolean hardwareAccelerated) {
        addAttribute("android:hardwareAccelerated", String.valueOf(hardwareAccelerated));
        return this;
    }

    public Activity setLaunchMode(String launchMode) {
        addAttribute("android:launchMode", launchMode);
        return this;
    }

    public Activity setPermission(String permission) {
        addAttribute("android:permission", permission);
        return this;
    }

    public Activity setTheme(String theme) {
        addAttribute("android:theme", theme);
        return this;
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

