import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

public class CharsetDecoder_2 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Charset charset = Charset.forName("UTF-8");
        CharsetDecoder decoder = charset.newDecoder();
        ByteBuffer byteBuffer = ByteBuffer.wrap(input.getBytes());
        CharBuffer charBuffer = CharBuffer.allocate(input.length());
        CoderResult result = decoder.decode(byteBuffer, charBuffer, true);
        charBuffer.flip();
        System.out.println(charBuffer.toString());
    }
}
