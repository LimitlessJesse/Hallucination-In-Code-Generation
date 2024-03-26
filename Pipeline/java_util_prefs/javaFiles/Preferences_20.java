import java.util.prefs.Preferences;
import java.io.FileOutputStream;
import java.io.IOException;

public class Preferences_20 {
    public static void main(String[] args) {
        Preferences prefs = Preferences.userRoot().node("/my/node");
        try {
            prefs.exportSubtree(new FileOutputStream("myPrefs.dat"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
