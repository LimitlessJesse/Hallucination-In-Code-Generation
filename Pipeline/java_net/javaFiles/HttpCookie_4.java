import java.net.HttpCookie;

public class HttpCookie_4 {
    public static void main(String[] args) {
        HttpCookie cookie = new HttpCookie("name", "value");
        cookie.setDomain("example.com");
        System.out.println(cookie.getDomain());
    }
}
