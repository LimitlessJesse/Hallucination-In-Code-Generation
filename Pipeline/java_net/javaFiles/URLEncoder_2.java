import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLEncoder_2 {
    public static void main(String[] args) {
        try {
            String s = "Hello World!";
            String encoded = URLEncoder.encode(s, StandardCharsets.UTF_8.toString());
            System.out.println(encoded);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
