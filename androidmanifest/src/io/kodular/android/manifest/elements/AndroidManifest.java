package io.kodular.android.manifest.elements;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.util.ArrayList;
import java.util.List;

public class AndroidManifest extends BaseElement {
    private Application application;
    private UsesSDK usesSDK = null;

    private List<Permission> permissions = new ArrayList<>();
    private List<UsesFeature> usesFeatures = new ArrayList<>();
    private List<UsesPermission> usesPermissions = new ArrayList<>();

    public AndroidManifest(String packageName) {
        super("manifest");

        properties.put("xmlns:android", "http://schemas.android.com/apk/res/android");
        properties.put("package", packageName);
        properties.put("android:installLocation", "auto");
    }

    public AndroidManifest(String packageName, String versionCode, String versionName) {
        super(packageName);

        setVersionCode(versionCode);
        setVersionName(versionName);
    }

    public Document getManifest() throws ParserConfigurationException {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();

        Element rootElement = this.toXML(doc);
        doc.appendChild(rootElement);

        return doc;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public void setUsesSDK(UsesSDK usesSDK) {
        this.usesSDK = usesSDK;
    }

    public void addPermission(Permission permission) {
        permissions.add(permission);
    }

    public void addUsesFeature(UsesFeature usesFeature) {
        usesFeatures.add(usesFeature);
    }

    public void addUsesPermission(UsesPermission usesPermission) {
        usesPermissions.add(usesPermission);
    }

    public void setVersionCode(String versionCode) {
        properties.put("android:versionCode", versionCode);
    }

    public void setVersionName(String versionName) {
        properties.put("android:versionName", versionName);
    }

    @Override
    public Element toXML(Document document) {
        Element element = super.toXML(document);

        for (Permission permission : permissions) {
            element.appendChild(permission.toXML(document));
        }

        for (UsesPermission usesPermission : usesPermissions) {
            element.appendChild(usesPermission.toXML(document));
        }

        for (UsesFeature usesFeature : usesFeatures) {
            element.appendChild(usesFeature.toXML(document));
        }

        if (usesSDK != null)
            element.appendChild(usesSDK.toXML(document));

        element.appendChild(application.toXML(document));

        return element;
    }
}
