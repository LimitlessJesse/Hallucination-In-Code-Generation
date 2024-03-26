import java.net.URLPermission;
import java.security.Permission;

public class URLPermission_1 {
    public static void main(String[] args) {
        URLPermission urlPermission = new URLPermission("http://www.example.com");
        Permission permission = new URLPermission("http://www.example.com");

        boolean implies = urlPermission.implies(permission);
        System.out.println(implies);
    }
}
