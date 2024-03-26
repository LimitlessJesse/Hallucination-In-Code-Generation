import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;

public class PermissionCollection_1 {
    public static void main(String[] args) {
        PermissionCollection permissions = new Permissions();
        permissions.add(new RuntimePermission("createClassLoader"));
        permissions.add(new RuntimePermission("accessDeclaredMembers"));

        Permission permission = new RuntimePermission("createClassLoader");
        boolean implies = permissions.implies(permission);

        System.out.println(implies);
    }
}
