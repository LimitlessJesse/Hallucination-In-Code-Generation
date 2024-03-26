import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLEncoder_1 {
    public static void main(String[] args) {
        try {
            String s = "Hello World!";
            String enc = URLEncoder.encode(s, StandardCharsets.UTF_8.toString());
            System.out.println(enc);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
