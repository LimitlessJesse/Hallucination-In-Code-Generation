import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public class URLDecoder_1 {
    public static void main(String[] args) {
        String s = "Hello%20World";
        String decoded = URLDecoder.decode(s, StandardCharsets.UTF_8.name());
        System.out.println(decoded);
    }
}
