package io.kodular.android.manifest.elements;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

public class Provider extends BaseElement
{
    private List<MetaData> metaData = new ArrayList<>();

    public Provider()
    {
        super("provider");
    }

    public void addMetaData(MetaData metaData)
    {
        this.metaData.add(metaData);
    }

    public void setExported(boolean exported) {
        properties.put("android:exported", exported ? "true" : "false");
    }

    public void setGrantUriPermissions(boolean grantUriPermissions) {
        properties.put("android:grantUriPermissions", grantUriPermissions ? "true" : "false");
    }

    public void setAuthorities(String authorities) {
        properties.put("android:authorities", authorities);
    }

    public void setInitOrder(String initOrder) {
        properties.put("android:permission", initOrder);
    }

    @Override
    public Element toXML(Document document)
    {
        Element element = super.toXML(document);

        for (MetaData metaData : this.metaData)
        {
            element.appendChild(metaData.toXML(document));
        }

        return element;
    }
}
