package io.kodular.android.manifest.elements;

public class UsesSDK extends BaseElement
{
    public UsesSDK(String minSdkVersion, String targetSdkVersion)
    {
        super("uses-sdk");

        setMinSdkVersion(minSdkVersion);
        setTargetSdkVersion(targetSdkVersion);
    }

    public UsesSDK(String minSdkVersion, String targetSdkVersion, String maxSdkVersion)
    {
        super("uses-sdk");

        setMinSdkVersion(minSdkVersion);
        setTargetSdkVersion(targetSdkVersion);
        setMaxSdkVersion(maxSdkVersion);
    }

    public void setMinSdkVersion(String minSdkVersion)
    {
        properties.put("android:minSdkVersion", minSdkVersion);
    }

    public void setTargetSdkVersion(String targetSdkVersion)
    {
        properties.put("android:targetSdkVersion", targetSdkVersion);
    }

    public void setMaxSdkVersion(String maxSdkVersion)
    {
        properties.put("android:maxSdkVersion", maxSdkVersion);
    }
}
