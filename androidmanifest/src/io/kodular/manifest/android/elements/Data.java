package io.kodular.manifest.android.elements;

public class Data extends BaseElement
{
    public Data()
    {
        super("data");
    }

    public void setScheme(String scheme)
    {
        properties.put("android:scheme", scheme);
    }

    public void setHost(String host)
    {
        properties.put("android:host", host);
    }

    public void setPort(String port)
    {
        properties.put("android:port", port);
    }

    public void setPath(String path)
    {
        properties.put("android:path", path);
    }

    public void setPathPrefix(String pathPrefix)
    {
        properties.put("android:pathPrefix", pathPrefix);
    }

    public void setPathPattern(String pathPattern)
    {
        properties.put("android:pathPattern", pathPattern);
    }

    public void setMimeType(String mimeType)
    {
        properties.put("android:mimeType", mimeType);
    }
}
