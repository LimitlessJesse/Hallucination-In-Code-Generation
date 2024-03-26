import java.io.StringBufferInputStream;
import java.io.IOException;

public class StringBufferInputStream_1 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello World");
        StringBufferInputStream sbis = new StringBufferInputStream(sb);

        int i;
        try {
            while ((i = sbis.read())!= -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
