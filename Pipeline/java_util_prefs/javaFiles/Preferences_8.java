import java.util.prefs.Preferences;

public class Preferences_8 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/test");
        prefs.putLong("key", 1234567890L);
    }
}
