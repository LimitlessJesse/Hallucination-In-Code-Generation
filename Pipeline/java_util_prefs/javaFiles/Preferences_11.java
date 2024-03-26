import java.util.prefs.Preferences;

public class Preferences_11 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("MyNode");
        prefs.putDouble("key", 123.45);
        double value = prefs.getDouble("key", 0.0);
        System.out.println(value);
    }
}
