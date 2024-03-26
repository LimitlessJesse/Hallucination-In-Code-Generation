import java.security.Permission;
import java.security.Permissions;

public class Permissions_1 {
    public static void main(String[] args) {
        Permissions permissions = new Permissions();
        permissions.add(new RuntimePermission("createClassLoader"));

        Permission permission = new RuntimePermission("setSecurityManager");
        boolean implies = permissions.implies(permission);

        System.out.println(implies);
    }
}
