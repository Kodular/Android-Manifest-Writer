package io.kodular.android.manifest.elements;

public class MetaData extends BaseElement
{
    public MetaData()
    {
        super("meta-data");
    }

    public void setValue(String value)
    {
        properties.put("android:value", value);
    }

    public void setResource(String resource)
    {
        properties.put("android:resource", resource);
    }
}
