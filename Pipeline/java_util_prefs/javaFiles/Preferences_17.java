import java.util.prefs.Preferences;

public class Preferences_17 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/MyNode");
        prefs.put("key1", "value1");
        prefs.put("key2", "value2");
        prefs.put("key3", "value3");

        System.out.println("Before removal: " + prefs.keys());

        prefs.remove("key2");

        System.out.println("After removal: " + prefs.keys());
    }
}
