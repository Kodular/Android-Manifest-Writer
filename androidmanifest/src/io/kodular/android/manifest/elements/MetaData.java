package io.kodular.android.manifest.elements;

public class MetaData extends BaseElement
{
    public MetaData()
    {
        super("meta-data");
    }

    public MetaData(String name, String value)
    {
        super("meta-data");
        setName(name);
        setValue(value);
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
