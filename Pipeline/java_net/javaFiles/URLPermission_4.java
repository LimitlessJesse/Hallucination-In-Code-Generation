import java.net.URLPermission;

public class URLPermission_4 {
    public static void main(String[] args) {
        URLPermission urlPermission = new URLPermission("http://www.example.com", "connect,resolve");
        String actions = urlPermission.getActions();
        System.out.println("Actions: " + actions);
    }
}
