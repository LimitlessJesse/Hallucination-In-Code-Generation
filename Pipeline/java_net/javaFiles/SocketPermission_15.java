import java.net.SocketPermission;

public class SocketPermission_15 {
    public static void main(String[] args) {
        SocketPermission sp1 = new SocketPermission("localhost:1024-65535", "connect,resolve");
        SocketPermission sp2 = new SocketPermission("localhost:1024-65535", "connect,resolve");
        SocketPermission sp3 = new SocketPermission("localhost:1024-65535", "connect");

        System.out.println(sp1.equals(sp2)); // true
        System.out.println(sp1.equals(sp3)); // false
    }
}
