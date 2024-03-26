import java.net.URLPermission;

public class URLPermission_2 {
    public static void main(String[] args) {
        URLPermission permission1 = new URLPermission("http://www.example.com");
        URLPermission permission2 = new URLPermission("http://www.example.com");
        URLPermission permission3 = new URLPermission("http://www.example2.com");

        System.out.println(permission1.equals(permission2)); // true
        System.out.println(permission1.equals(permission3)); // false
    }
}
