import java.util.Enumeration;
import java.util.ResourceBundle;

public class ResourceBundle_2 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyBundle");
        Enumeration<String> keys = bundle.getKeys();

        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println(key + ": " + bundle.getString(key));
        }
    }
}
