import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.util.PropertyPermission;

public class PropertyPermission_3 {
    public static void main(String[] args) {
        Permission permission = new PropertyPermission("java.version", "read");
        int hashCode = permission.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
