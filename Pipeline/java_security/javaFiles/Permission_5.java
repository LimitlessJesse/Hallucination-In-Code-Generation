import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;

public class Permission_5 {
    public static void main(String[] args) {
        Permission permission = new Permissions();
        permission.add(new java.io.FilePermission("/home/user/", "read"));
        System.out.println(permission.getName());
    }
}
