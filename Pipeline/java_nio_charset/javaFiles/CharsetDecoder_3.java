import java.nio.charset.*;
import java.nio.*;

public class CharsetDecoder_3 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        CharsetDecoder decoder = charset.newDecoder();
        CharBuffer charBuffer = CharBuffer.allocate(1024);
        CoderResult result = decoder.flush(charBuffer);
        if (result.isUnderflow()) {
            System.out.println("Underflow occurred");
        } else if (result.isOverflow()) {
            System.out.println("Overflow occurred");
        } else if (result.isError()) {
            System.out.println("Error occurred");
        }
    }
}
