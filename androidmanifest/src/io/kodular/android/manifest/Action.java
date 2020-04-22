package io.kodular.android.manifest;

import javax.xml.bind.annotation.XmlAttribute;

public class Action {
    @XmlAttribute(namespace = "android", required = true)
    public String name;

    public Action withName(String name) {
        if (name.startsWith("ACTION_")) {
            this.name = "android.intent.action." + name.substring("ACTION_".length());
        } else {
            this.name = name;
        }
        return this;
    }
}
