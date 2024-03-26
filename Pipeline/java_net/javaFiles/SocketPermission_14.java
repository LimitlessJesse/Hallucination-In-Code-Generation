import java.net.SocketPermission;
import java.security.Permission;

public class SocketPermission_14 {
    public static void main(String[] args) {
        SocketPermission socketPermission = new SocketPermission("localhost:1024-65535", "connect,resolve");
        Permission permission = new SocketPermission("localhost:1024-65535", "connect");

        boolean implies = socketPermission.implies(permission);
        System.out.println(implies);
    }
}
