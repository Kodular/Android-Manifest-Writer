package io.kodular.android.manifest.elements;

public class Data extends BaseElement {
    public Data() {
        super("data");
    }

    public Data(String mimeType) {
        super("data");
        setMimeType(mimeType);
    }

    public void setScheme(String scheme) {
        addAttribute("android:scheme", scheme);
    }

    public void setHost(String host) {
        addAttribute("android:host", host);
    }

    public void setPort(String port) {
        addAttribute("android:port", port);
    }

    public void setPath(String path) {
        addAttribute("android:path", path);
    }

    public void setPathPrefix(String pathPrefix) {
        addAttribute("android:pathPrefix", pathPrefix);
    }

    public void setPathPattern(String pathPattern) {
        addAttribute("android:pathPattern", pathPattern);
    }

    public void setMimeType(String mimeType) {
        addAttribute("android:mimeType", mimeType);
    }
}
