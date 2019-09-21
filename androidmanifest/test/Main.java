import io.kodular.android.manifest.elements.*;

public class Main {
    public static void main(String[] args) {
        Manifest manifest = new Manifest("io.kodular.test", "1", "1.0");

        UsesSdk usesSdk = new UsesSdk().setMinSdkVersion(16).setTargetSdkVersion(28);
        manifest.setUsesSdk(usesSdk);

        Permission permission = new Permission();
        manifest.addPermission(permission);

        Application application = new Application();

        Activity activity = new Activity()
                .setConfigChanges(Activity.ConfigChanges.mcc, Activity.ConfigChanges.locale)
                .setExcludeFromRecents(true);

        application.addActivity(activity);

        manifest.setApplication(application);
      
        System.out.println(BaseElement.toXmlString(manifest));
    }
}