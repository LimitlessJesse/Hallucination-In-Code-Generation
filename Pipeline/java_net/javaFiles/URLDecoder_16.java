import java.net.URLDecoder;
import java.io.UnsupportedEncodingException;

public class URLDecoder_16 {
    public static void main(String[] args) {
        String s = "Hello%20World";
        try {
            String decoded = URLDecoder.decode(s, "UTF-8");
            System.out.println(decoded);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
