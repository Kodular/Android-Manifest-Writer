package io.kodular.android.manifest.elements;

public class Action extends BaseElement
{
    public Action()
    {
        super("action");
    }

    public void setName(String name)
    {
        addAttribute("android:name", name);
    }
}
