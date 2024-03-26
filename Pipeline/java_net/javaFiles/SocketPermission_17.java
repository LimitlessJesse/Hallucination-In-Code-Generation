import java.net.SocketPermission;

public class SocketPermission_17 {
    public static void main(String[] args) {
        SocketPermission socketPermission = new SocketPermission("*", "connect,resolve");
        String actions = socketPermission.getActions();
        System.out.println(actions);
    }
}
