import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;

public class Permission_1 {
    public static void main(String[] args) {
        Permission permission1 = new java.lang.RuntimePermission("createClassLoader");
        Permission permission2 = new java.lang.RuntimePermission("setSecurityManager");

        PermissionCollection permissions = new Permissions();
        permissions.add(permission1);

        System.out.println(permission2.implies(permission1)); // false
        System.out.println(permissions.implies(permission2)); // false
    }
}
