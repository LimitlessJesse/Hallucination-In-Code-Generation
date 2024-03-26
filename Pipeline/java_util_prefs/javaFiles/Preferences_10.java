import java.util.prefs.Preferences;

public class Preferences_10 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/test");
        prefs.putFloat("key", 1.23f);
    }
}
