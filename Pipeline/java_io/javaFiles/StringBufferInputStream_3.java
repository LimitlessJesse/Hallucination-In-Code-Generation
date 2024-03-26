import java.io.StringBufferInputStream;
import java.io.IOException;

public class StringBufferInputStream_3 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello, World!");
        StringBufferInputStream sbis = new StringBufferInputStream(sb);
        byte[] b = new byte[100];
        try {
            int numRead = sbis.read(b, 0, b.length);
            System.out.println("Number of bytes read: " + numRead);
            System.out.println("Data read: " + new String(b, 0, numRead));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
