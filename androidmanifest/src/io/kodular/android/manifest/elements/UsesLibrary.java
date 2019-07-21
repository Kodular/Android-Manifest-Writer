package io.kodular.android.manifest.elements;

public class UsesLibrary extends BaseElement
{
    public UsesLibrary()
    {
        super("uses-library");
    }

    public void setRequired(boolean required)
    {
        addAttribute("android:required", , String.valueOf(required)))
    }
}
