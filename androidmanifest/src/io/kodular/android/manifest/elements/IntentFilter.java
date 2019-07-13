package io.kodular.android.manifest.elements;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

public class IntentFilter extends BaseElement
{
    private List<Action> actions = new ArrayList<>();
    private List<Category> categories = new ArrayList<>();
    private List<Data> data = new ArrayList<>();

    public IntentFilter()
    {
        super("intent-filter");
    }

    public void addAction(Action action)
    {
        actions.add(action);
    }

    public void addCategory(Category category)
    {
        categories.add(category);
    }

    public void addData(Data data)
    {
        this.data.add(data);
    }

    public void setIcon(String icon) {
        properties.put("android:icon", icon);
    }

    public void setLabel(String label) {
        properties.put("android:label", label);
    }

    public void setPriority(String priority) {
        properties.put("android:priority", priority);
    }

    @Override
    public Element toXML(Document document)
    {
        Element element = super.toXML(document);

        for (Action action : actions)
        {
            element.appendChild(action.toXML(document));
        }

        for (Category category : categories)
        {
            element.appendChild(category.toXML(document));
        }

        for (Data data : this.data)
        {
            element.appendChild(data.toXML(document));
        }

        return element;
    }
}
