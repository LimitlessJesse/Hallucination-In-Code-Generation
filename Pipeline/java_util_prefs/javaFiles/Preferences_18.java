import java.util.prefs.Preferences;

public class Preferences_18 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/MyNode");
        prefs.put("key1", "value1");
        prefs.put("key2", "value2");
        System.out.println("Before clear: " + prefs.keys());
        prefs.clear();
        System.out.println("After clear: " + prefs.keys());
    }
}
