package io.kodular.android.manifest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import java.util.ArrayList;
import java.util.List;

import static io.kodular.android.manifest.Constants.ANDROID_NS;

public class Application {
    @XmlAttribute(namespace = ANDROID_NS)
    public String name;
    @XmlElement(name = "activity")
    public List<Activity> activityList = new ArrayList<>();

    public Application withName(String name) {
        this.name = name;
        return this;
    }

    public Application addActivity(Activity activity) {
        activityList.add(activity);
        return this;
    }
//
//    public void addMetaData(MetaData metaData) {
//        addChild(metaData);
//    }
//
//    public void addProvider(Provider provider) {
//        addChild(provider);
//    }
//
//    public void addReceiver(Receiver receiver) {
//        addChild(receiver);
//    }
//
//    public void addService(Service service) {
//        addChild(service);
//    }
//
//    public void addUsesLibrary(UsesLibrary usesLibrary) {
//        addChild(usesLibrary);
//    }
}
