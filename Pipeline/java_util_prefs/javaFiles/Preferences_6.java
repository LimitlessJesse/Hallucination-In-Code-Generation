import java.util.prefs.Preferences;

public class Preferences_6 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/test");
        prefs.putInt("key", 100);
    }
}
