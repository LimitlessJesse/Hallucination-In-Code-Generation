import java.security.BasicPermission;
import java.security.Permission;

public class BasicPermission_1 {
    public static void main(String[] args) {
        BasicPermission permission1 = new BasicPermission("test");
        Permission permission2 = new BasicPermission("test");

        boolean result = permission1.implies(permission2);
        System.out.println(result);
    }
}
