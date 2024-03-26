import java.util.jar.Attributes;
import java.util.jar.Manifest;

public class Attributes_3 {
    public static void main(String[] args) {
        Manifest manifest = new Manifest();
        Attributes attributes = manifest.getMainAttributes();

        if (attributes.isEmpty()) {
            System.out.println("Attributes object is empty");
        } else {
            System.out.println("Attributes object is not empty");
        }
    }
}
