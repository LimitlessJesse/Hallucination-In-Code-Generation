import java.util.prefs.Preferences;

public class Preferences_4 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/MyApp");
        prefs.put("username", "john_doe");
        prefs.put("password", "secret");
    }
}
