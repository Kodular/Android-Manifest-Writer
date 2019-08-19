package io.kodular.android.manifest.elements;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.StringWriter;

public class Manifest extends BaseElement {

    public Manifest(String packageName, String versionCode, String versionName) {
        super("manifest");

        addAttribute("xmlns:android", "http://schemas.android.com/apk/res/android");
        addAttribute("xmlns:tools", "http://schemas.android.com/tools");
        addAttribute("package", packageName);
        addAttribute("android:versionCode", versionCode);
        addAttribute("android:versionName", versionName);
        addAttribute("android:installLocation", "auto");
    }

    public void setUsesSdk(UsesSdk usesSdk) {
        addChild(usesSdk);
    }

    public void setApplication(Application application) {
        addChild(application);
    }

    public void addPermission(Permission permission) {
        addChild(permission);
    }

    public void addUsesFeature(UsesFeature usesFeature) {
        addChild(usesFeature);
    }

    public void addUsesPermission(UsesPermission usesPermission) {
        addChild(usesPermission);
    }

    public String toXmlString() {
        try {
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

            doc.appendChild(getElement(doc));

            StringWriter sw = new StringWriter();

            Transformer transformer = TransformerFactory.newInstance().newTransformer();

            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

            transformer.transform(new DOMSource(doc), new StreamResult(sw));

            return sw.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error converting to String", e);
        }
    }
}
