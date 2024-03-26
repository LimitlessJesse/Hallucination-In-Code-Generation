import java.util.prefs.Preferences;

public class Preferences_9 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/test");
        prefs.putFloat("key", 1.23f);
        float value = prefs.getFloat("key", 0.0f);
        System.out.println(value);
    }
}
