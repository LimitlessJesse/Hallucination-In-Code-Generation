import java.io.StringBufferInputStream;
import java.io.IOException;

public class StringBufferInputStream_5 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, World!");
        StringBufferInputStream sbis = new StringBufferInputStream(sb);

        try {
            int available = sbis.available();
            System.out.println("Available bytes: " + available);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
