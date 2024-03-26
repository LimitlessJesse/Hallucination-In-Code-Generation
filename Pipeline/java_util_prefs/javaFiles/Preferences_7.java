import java.util.prefs.Preferences;

public class Preferences_7 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/test");
        prefs.putLong("key", 1234567890L);
        long value = prefs.getLong("key", 0L);
        System.out.println(value);
    }
}
