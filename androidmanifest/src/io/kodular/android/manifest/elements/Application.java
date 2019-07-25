package io.kodular.android.manifest.elements;

public class Application extends BaseElement {
    public Application() {
        super("application");
    }

    public void addActivity(Activity activity) {
        addChild(activity);
    }

    public void addMetaData(MetaData metaData) {
        addChild(metaData);
    }

    public void addProvider(Provider provider) {
        addChild(provider);
    }

    public void addReceiver(Receiver receiver) {
        addChild(receiver);
    }

    public void addService(Service service) {
        addChild(service);
    }

    public void addUsesLibrary(UsesLibrary usesLibrary) {
        addChild(usesLibrary);
    }
}
