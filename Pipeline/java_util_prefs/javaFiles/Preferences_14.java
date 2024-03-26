import java.util.prefs.Preferences;

public class Preferences_14 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/MyNode");
        byte[] value = {1, 2, 3, 4, 5};
        prefs.putByteArray("myKey", value);
    }
}
