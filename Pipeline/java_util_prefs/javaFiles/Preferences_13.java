import java.util.prefs.Preferences;

public class Preferences_13 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("MyNode");
        byte[] bytes = prefs.getByteArray("MyKey", new byte[0]);
        System.out.println(bytes);
    }
}
