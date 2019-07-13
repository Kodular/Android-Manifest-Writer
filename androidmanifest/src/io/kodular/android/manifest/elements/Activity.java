package io.kodular.android.manifest.elements;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

public class Activity extends BaseElement
{
    private List<IntentFilter> intentFilters = new ArrayList<>();
    private List<MetaData> metaData = new ArrayList<>();

    public Activity()
    {
        super("activity");
    }

    public void addIntentFilter(IntentFilter intentFilter)
    {
        intentFilters.add(intentFilter);
    }

    public void addMetaData(MetaData metaData)
    {
        this.metaData.add(metaData);
    }

    public void setConfigChanges(String configChanges)
    {
        properties.put("android:configChanges", configChanges);
    }

    public void setExcludeFromRecents(boolean excludeFromRecents)
    {
        properties.put("android:excludeFromRecents", excludeFromRecents ? "true" : "false");
    }

    public void setExported(boolean exported)
    {
        properties.put("android:exported", exported ? "true" : "false");
    }

    public void setHardwareAccelerated(boolean hardwareAccelerated)
    {
        properties.put("android:hardwareAccelerated", hardwareAccelerated ? "true" : "false");
    }

    public void setLaunchMode(String launchMode)
    {
        properties.put("android:hardwareAccelerated", launchMode);
    }

    public void setPermission(String permission)
    {
        properties.put("android:permission", permission);
    }

    public void setTheme(String theme)
    {
        properties.put("android:theme", theme);
    }

    @Override
    public Element toXML(Document document)
    {
        Element element = super.toXML(document);

        for (IntentFilter intentFilter : intentFilters)
        {
            element.appendChild(intentFilter.toXML(document));
        }

        for (MetaData metaData : this.metaData)
        {
            element.appendChild(metaData.toXML(document));
        }

        return element;
    }
}
