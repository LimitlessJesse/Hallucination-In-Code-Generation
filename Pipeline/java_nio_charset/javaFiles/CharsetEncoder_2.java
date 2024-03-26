import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CharsetEncoder_2 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        CharsetEncoder encoder = charset.newEncoder();

        byte[] bytes = "Hello".getBytes();
        boolean isLegal = encoder.isLegalReplacement(bytes);

        System.out.println("Is legal replacement: " + isLegal);
    }
}
