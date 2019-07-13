package io.kodular.android.manifest;

import io.kodular.android.manifest.elements.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

public class AndroidManifest extends Manifest
{
    public AndroidManifest(String packageName, String versionCode, String versionName)
    {
        super(packageName);

        setVersionCode(versionCode);
        setVersionName(versionName);
    }

    public Document getManifest() throws ParserConfigurationException
    {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();

        Element rootElement = this.toXML(doc);
        doc.appendChild(rootElement);

        return doc;
    }
}
