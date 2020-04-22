package io.kodular.android.manifest;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

import static io.kodular.android.manifest.Constants.ANDROID_NS;

public class IntentFilter {
    @XmlAttribute(namespace = ANDROID_NS)
    public String icon;
    @XmlAttribute(namespace = ANDROID_NS)
    public String label;
    @XmlAttribute(namespace = ANDROID_NS)
    public int priority;

    @XmlElement(required = true)
    public List<Action> actionList;
    @XmlElement
    public List<Category> categoryList;
    @XmlElement
    public List<Data> dataList;

    public IntentFilter withIcon(String icon) {
        this.icon = icon;
        return this;
    }

    public IntentFilter withLabel(String label) {
        this.label = label;
        return this;
    }

    public IntentFilter withPriority(int priority) {
        this.priority = priority;
        return this;
    }

    public IntentFilter addAction(Action action) {
        actionList.add(action);
        return this;
    }

    public IntentFilter addCategory(Category category) {
        categoryList.add(category);
        return this;
    }

    public IntentFilter addData(Data data) {
        dataList.add(data);
        return this;
    }
}
