import java.util.ResourceBundle;

public class ResourceBundle_3 {
    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("MyBundle");
        Object obj = bundle.getObject("key");
        System.out.println(obj);
    }
}
