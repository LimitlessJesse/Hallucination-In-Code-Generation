import java.util.prefs.Preferences;
import java.io.FileOutputStream;
import java.io.IOException;

public class Preferences_22 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/MyApp");
        try {
            prefs.exportNode(new FileOutputStream("myPrefs.dat"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
