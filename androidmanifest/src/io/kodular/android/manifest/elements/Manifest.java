package io.kodular.android.manifest.elements;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

public class Manifest extends BaseElement
{
    private Application application;
    private UsesSDK usesSDK = null;

    private List<Permission> permissions = new ArrayList<>();
    private List<UsesFeature> usesFeatures = new ArrayList<>();
    private List<UsesPermission> usesPermissions = new ArrayList<>();

    public Manifest(String packageName)
    {
        super("manifest");

        properties.put("xmlns:android", "http://schemas.android.com/apk/res/android");
        properties.put("package", packageName);
        properties.put("android:installLocation", "auto");
    }

    public void setApplication(Application application)
    {
        this.application = application;
    }

    public Application getApplication()
    {
        return application;
    }

    public void setUsesSDK(UsesSDK usesSDK)
    {
        this.usesSDK = usesSDK;
    }

    public void addPermission(Permission permission)
    {
        permissions.add(permission);
    }

    public void addUsesFeature(UsesFeature usesFeature)
    {
        usesFeatures.add(usesFeature);
    }

    public void addUsesPermission(UsesPermission usesPermission)
    {
        usesPermissions.add(usesPermission);
    }

    public void setVersionCode(String versionCode)
    {
        properties.put("android:versionCode", versionCode);
    }

    public void setVersionName(String versionName)
    {
        properties.put("android:versionName", versionName);
    }

    @Override
    public Element toXML(Document document)
    {
        Element element = super.toXML(document);

        for (Permission permission : permissions)
        {
            element.appendChild(permission.toXML(document));
        }

        for (UsesPermission usesPermission : usesPermissions)
        {
            element.appendChild(usesPermission.toXML(document));
        }

        for (UsesFeature usesFeature : usesFeatures)
        {
            element.appendChild(usesFeature.toXML(document));
        }

        if (usesSDK != null)
            element.appendChild(usesSDK.toXML(document));

        element.appendChild(application.toXML(document));

        return element;
    }
}
