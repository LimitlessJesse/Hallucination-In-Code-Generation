import javax.swing.UIDefaults;
import java.util.Enumeration;

public class UIDefaults_2 {
    public static void main(String[] args) {
        UIDefaults defaults = new UIDefaults();
        defaults.put("key", "value");

        Enumeration<Object> keys = defaults.keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            System.out.println("Key: " + key + ", Value: " + defaults.get(key));
        }
    }
}
