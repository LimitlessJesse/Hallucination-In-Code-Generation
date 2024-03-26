import java.util.PropertyPermission;
import java.security.Permission;

public class PropertyPermission_1 {
    public static void main(String[] args) {
        // Create a PropertyPermission with "read" action
        PropertyPermission readPermission = new PropertyPermission("read", "read");

        // Create a PropertyPermission with "write" action
        PropertyPermission writePermission = new PropertyPermission("write", "write");

        // Check if readPermission implies writePermission
        boolean implies = readPermission.implies(writePermission);

        // Print the result
        System.out.println(implies);
    }
}
