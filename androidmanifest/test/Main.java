import io.kodular.android.manifest.Activity;
import io.kodular.android.manifest.Application;
import io.kodular.android.manifest.Manifest;
import io.kodular.android.manifest.UsesSdk;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import static io.kodular.android.manifest.Activity.ConfigChanges.locale;
import static io.kodular.android.manifest.Activity.ConfigChanges.mcc;

public class Main {
    public static void main(String[] args) throws JAXBException {
        Manifest manifest = new Manifest()
                .withPackageName("io.kodular.test")
                .withVersionCode(1)
                .withVersionName("1.0");

        UsesSdk usesSdk = new UsesSdk().withMinSdkVersion(16).withTargetSdkVersion(28);

        manifest.withUsesSdk(usesSdk);

        Application application = new Application()
                .withName("TEST");

        Activity activity = new Activity()
                .withName(".Screen1")
                .configChanges(mcc, locale);
//                .setExcludeFromRecents(true);

        Activity activity2 = new Activity()
                .withName(".Screen2")
                .configChanges(mcc, locale);

        application.addActivity(activity).addActivity(activity2);

        manifest.withApplication(application);

        JAXBContext context = JAXBContext.newInstance(Manifest.class);
        Marshaller mar = context.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(manifest, System.out);
    }
}