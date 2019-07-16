package io.kodular.android.manifest.elements;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Application extends BaseElement
{
    private List<Activity> activities = new ArrayList<>();
    private List<MetaData> metaData = new ArrayList<>();
    private List<Provider> providers = new ArrayList<>();
    private List<Receiver> receivers = new ArrayList<>();
    private List<Service> services = new ArrayList<>();
    private List<UsesLibrary> usesLibraries = new ArrayList<>();

    public Application(String label, String theme, String name, boolean debuggable, String supportsRtl)
    {
        super("application");

        properties.put("android:theme", theme);
        properties.put("android:label", label);
        properties.put("android:icon", "@drawable/ya");
        properties.put("android:name", theme);
        properties.put("android:debuggable", debuggable ? "true" : "false");
        properties.put("android:supportsRtl", supportsRtl);
        properties.put("android:usesCleartextTraffic", "true");
    }

    public void addActivity(Activity activity)
    {
        activities.add(activity);
    }

    public void addMetaData(MetaData metaData)
    {
        this.metaData.add(metaData);
    }

    public void addProvider(Provider provider)
    {
        providers.add(provider);
    }

    public void addReceiver(Receiver receiver)
    {
        receivers.add(receiver);
    }

    public void addService(Service service)
    {
        services.add(service);
    }

    public void addUsesLibrary(UsesLibrary usesLibrary)
    {
        usesLibraries.add(usesLibrary);
    }

    @Override
    public Element toXML(Document document)
    {
        Element element = super.toXML(document);

        for (Activity activity : activities)
        {
            element.appendChild(activity.toXML(document));
        }

        for (MetaData metaData : this.metaData)
        {
            element.appendChild(metaData.toXML(document));
        }

        for (Provider provider : providers)
        {
            element.appendChild(provider.toXML(document));
        }

        for (Receiver receiver : receivers)
        {
            element.appendChild(receiver.toXML(document));
        }

        for (Service service : services)
        {
            element.appendChild(service.toXML(document));
        }

        for (UsesLibrary usesLibrary : usesLibraries)
        {
            element.appendChild(usesLibrary.toXML(document));
        }

        return element;
    }
}
