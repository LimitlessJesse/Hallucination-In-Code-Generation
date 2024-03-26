import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundle_5 {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("MyBundle", Locale.getDefault());
        Locale locale = rb.getLocale();
        System.out.println("Locale: " + locale);
    }
}
