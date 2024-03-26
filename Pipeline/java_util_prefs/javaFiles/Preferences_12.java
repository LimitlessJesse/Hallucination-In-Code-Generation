import java.util.prefs.Preferences;

public class Preferences_12 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("MyPrefs");
        prefs.putDouble("key", 123.456);
    }
}
