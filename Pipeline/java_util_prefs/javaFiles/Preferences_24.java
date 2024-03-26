import java.util.prefs.Preferences;

public class Preferences_24 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("MyPrefs");
        prefs.put("key", "value");
        prefs.sync();
    }
}
