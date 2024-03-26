import java.util.prefs.Preferences;

public class Preferences_5 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/test");
        prefs.putInt("key", 10);
        int value = prefs.getInt("key", 0);
        System.out.println(value);
    }
}
