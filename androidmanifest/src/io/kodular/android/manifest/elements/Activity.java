package io.kodular.android.manifest.elements;

public class Activity extends BaseElement
{
    public Activity()
    {
        super("activity");
    }

    public void setName(String name)
    {
        addAttribute("android:name", name);
    }

    public void setConfigChanges(String configChanges)
    {
        addAttribute("android:configChanges", configChanges);
    }

    public void setExcludeFromRecents(boolean excludeFromRecents)
    {
        addAttribute("android:excludeFromRecents", String.valueOf(excludeFromRecents));
    }

    public void setExported(boolean exported)
    {
        addAttribute("android:exported", String.valueOf(exported));
    }

    public void setHardwareAccelerated(boolean hardwareAccelerated)
    {
        addAttribute("android:hardwareAccelerated", String.valueOf(hardwareAccelerated));
    }

    public void setLaunchMode(String launchMode)
    {
        addAttribute("android:launchMode", launchMode);
    }

    public void setPermission(String permission)
    {
        addAttribute("android:permission", permission);
    }

    public void setTheme(String theme)
    {
        addAttribute("android:theme", theme);
    }

    public void addIntentFilter(IntentFilter intentFilter)
    {
        addChild(intentFilter);
    }

    public void addMetaData(MetaData metaData)
    {
        addChild(metaData);
    }
}
