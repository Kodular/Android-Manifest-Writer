@XmlSchema(
        attributeFormDefault = XmlNsForm.QUALIFIED,
        xmlns = {
                @XmlNs(prefix = "android", namespaceURI = ANDROID_NS),
                @XmlNs(prefix = "tools", namespaceURI = TOOLS_NS)
        }
)
package io.kodular.android.manifest;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;

import static io.kodular.android.manifest.Constants.ANDROID_NS;
import static io.kodular.android.manifest.Constants.TOOLS_NS;