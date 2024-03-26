import java.net.URLPermission;

public class URLPermission_3 {
    public static void main(String[] args) {
        URLPermission urlPermission = new URLPermission("http://www.example.com");
        int hashCode = urlPermission.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
