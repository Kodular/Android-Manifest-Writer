package io.kodular.android.manifest.elements;

public class Application extends BaseElement
{
    public Application()
    {
        super("application");
    }

    public void addActivity(Activity activity)
    {
        addChild(activity);
    }

    public void addActivity(MetaData metaData)
    {
        addChild(metaData);
    }

    public void addActivity(Provider provider)
    {
        addChild(provider);
    }

    public void addActivity(Receiver receiver)
    {
        addChild(receiver);
    }

    public void addActivity(Service service)
    {
        addChild(service);
    }

    public void addActivity(UsesLibrary usesLibrary)
    {
        addChild(usesLibrary);
    }
}
