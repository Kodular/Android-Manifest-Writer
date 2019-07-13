package io.kodular.android.manifest.elements;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

public class Receiver extends BaseElement
{
    private List<IntentFilter> intentFilters = new ArrayList<>();
    private List<MetaData> metaData = new ArrayList<>();

    public Receiver()
    {
        super("receiver");
    }

    public void addIntentFilter(IntentFilter intentFilter)
    {
        intentFilters.add(intentFilter);
    }

    public void addMetaData(MetaData metaData)
    {
        this.metaData.add(metaData);
    }

    public void setDirectBootAware(boolean directBootAware) {
        properties.put("android:directBootAware", directBootAware ? "true" : "false");
    }

    public void setEnabled(boolean enabled) {
        properties.put("android:enabled", enabled ? "true" : "false");
    }

    public void setExported(boolean exported) {
        properties.put("android:exported", exported ? "true" : "false");
    }

    public void setIcon(String icon) {
        properties.put("android:icon", icon);
    }

    public void setLabel(String label) {
        properties.put("android:label", label);
    }

    public void setPermission(String permission) {
        properties.put("android:permission", permission);
    }

    public void setProcess(String process) {
        properties.put("android:process", process);
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
