import java.io.FilePermission;
import java.security.Permission;

public class FilePermission_2 {
    public static void main(String[] args) {
        try {
            // Create a FilePermission object
            FilePermission filePermission = new FilePermission("<<ALL FILES>>", "read,write");

            // Create a Permission object
            Permission permission = new FilePermission("<<ALL FILES>>", "read");

            // Check if the FilePermission object implies the Permission object
            boolean implies = filePermission.implies(permission);

            // Print the result
            System.out.println("Does the FilePermission imply the Permission? " + implies);
        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
