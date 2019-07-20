package io.kodular.android.manifest.elements;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

public class Activity implements XmlElement {

    /* Properties */
    private String name;
    private String configChanges;
    private boolean excludeFromRecents;
    private boolean exported;
    private boolean hardwareAccelerated;
    private String launchMode;
    private String permission;
    private String theme;

    /* Children */
    private List<IntentFilter> intentFilters = new ArrayList<>();
    private List<MetaData> metaData = new ArrayList<>();

    /* Getters and Setters */
    public void setName(String name) {
        this.name = name;
    }

    public void setConfigChanges(String configChanges) {
        this.configChanges = configChanges;
    }

    public void setExcludeFromRecents(boolean excludeFromRecents) {
        this.excludeFromRecents = excludeFromRecents;
    }

    public void setExported(boolean exported) {
        this.exported = exported;
    }

    public void setHardwareAccelerated(boolean hardwareAccelerated) {
        this.hardwareAccelerated = hardwareAccelerated;
    }

    public void setLaunchMode(String launchMode) {
        this.launchMode = launchMode;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void addIntentFilter(IntentFilter intentFilter) {
        intentFilters.add(intentFilter);
    }

    public void addMetaData(MetaData metaData) {
        this.metaData.add(metaData);
    }

    @Override
    public Element toXml(Document document) {
        Element activityElement = document.createElement("activity");

        activityElement.setAttribute("android:name", name);
        activityElement.setAttribute("android:configChanges", configChanges);
        activityElement.setAttribute("android:excludeFromRecents", String.valueOf(excludeFromRecents));
        activityElement.setAttribute("android:exported", String.valueOf(exported));
        activityElement.setAttribute("android:hardwareAccelerated", String.valueOf(hardwareAccelerated));
        activityElement.setAttribute("android:launchMode", launchMode);
        activityElement.setAttribute("android:permission", permission);
        activityElement.setAttribute("android:theme", theme);

        for (IntentFilter intentFilter : intentFilters) {
            activityElement.appendChild(intentFilter.toXML(document));
        }

        for (MetaData metaData : this.metaData) {
            activityElement.appendChild(metaData.toXML(document));
        }

        return activityElement;
    }
}
