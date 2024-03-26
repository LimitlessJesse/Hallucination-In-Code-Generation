import java.util.prefs.Preferences;

public class Preferences_1 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("MyNode");
        prefs.putBoolean("myBoolean", true);
        boolean myBoolean = prefs.getBoolean("myBoolean", false);
        System.out.println(myBoolean);
    }
}
