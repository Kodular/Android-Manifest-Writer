import io.kodular.android.manifest.AndroidManifestPoet;
import io.kodular.android.manifest.elements.*;

import javax.xml.parsers.ParserConfigurationException;

public class Main {

    public static void main(String[] args) throws ParserConfigurationException {
        Manifest manifest = new Manifest("io.kodular.test", "1", "1.0");

        UsesSdk usesSdk = new UsesSdk().setMinSdkVersion(16).setTargetSdkVersion(28);

        manifest.setUsesSdk(usesSdk);

        Application application = new Application();

        Activity activity = new Activity()
                .setConfigChanges(Activity.ConfigChanges.mcc, Activity.ConfigChanges.locale)
                .setExcludeFromRecents(true);

        application.addActivity(activity);

        manifest.setApplication(application);

        System.out.println(AndroidManifestPoet.toXmlString(manifest));
    }
}
