import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class CharsetDecoder_1 {
    public static void main(String[] args) {
        CharsetDecoder decoder = Charset.forName("UTF-8").newDecoder();
        System.out.println(decoder.charset());
    }
}
