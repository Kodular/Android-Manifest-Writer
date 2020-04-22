package io.kodular.android.manifest;

import javax.xml.bind.annotation.XmlAttribute;

import static io.kodular.android.manifest.Constants.ANDROID_NS;

public class Activity {
    @XmlAttribute(namespace = ANDROID_NS, required = true)
    public String name;
    @XmlAttribute(namespace = ANDROID_NS)
    public String configChanges;
//    public boolean excludeFromRecents;
//    public boolean exported;
//    public boolean hardwareAccelerated;
//    public String launchMode;
//    public String permission;

    public Activity withName(String name) {
        this.name = name;
        return this;
    }

    public Activity configChanges(ConfigChanges... configChanges) {
        this.configChanges = Util.join("|", configChanges);
        return this;
    }

//    public boolean isExcludeFromRecents() {
//        return excludeFromRecents;
//    }
//
//    public void setExcludeFromRecents(boolean excludeFromRecents) {
//        this.excludeFromRecents = excludeFromRecents;
//        addAttribute("android:excludeFromRecents", String.valueOf(excludeFromRecents));
//    }
//
//    public void setExported(boolean exported) {
//        this.exported = exported;
//        addAttribute("android:exported", String.valueOf(exported));
//    }
//
//    public void setHardwareAccelerated(boolean hardwareAccelerated) {
//        this.hardwareAccelerated = hardwareAccelerated;
//        addAttribute("android:hardwareAccelerated", String.valueOf(hardwareAccelerated));
//    }
//
//    public void setLaunchMode(String launchMode) {
//        this.launchMode = launchMode;
//        addAttribute("android:launchMode", launchMode);
//    }
//
//    public void setPermission(String permission) {
//        this.permission = permission;
//        addAttribute("android:permission", permission);
//    }
//
//    public void setTheme(String theme) {
//        addAttribute("android:theme", theme);
//    }
//
//    public void addIntentFilter(IntentFilter intentFilter) {
//        addChild(intentFilter);
//    }
//
//    public void addMetaData(MetaData metaData) {
//        addChild(metaData);
//    }
//
//    public boolean isExported() {
//        return exported;
//    }
//
//    public boolean isHardwareAccelerated() {
//        return hardwareAccelerated;
//    }
//
//    public String getLaunchMode() {
//        return launchMode;
//    }
//
//    public String getPermission() {
//        return permission;
//    }


    public enum ConfigChanges {
        mcc, mnc, locale, touchscreen, keyboard, keyboardHidden, navigation, screenLayout, fontScale, uiMode,
        orientation, density, screenSize, smallestScreenSize
    }
}

