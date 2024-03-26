import java.io.PushbackReader;
import java.io.StringReader;
import java.io.IOException;

public class PushbackReader_5 {
    public static void main(String[] args) {
        StringReader sr = new StringReader("Hello World");
        PushbackReader pr = new PushbackReader(sr);

        try {
            char[] buf = new char[10];
            pr.read(buf, 0, 5);
            System.out.println(new String(buf, 0, 5)); // Output: Hello

            pr.unread(buf, 0, 5);

            pr.read(buf, 0, 5);
            System.out.println(new String(buf, 0, 5)); // Output: Hello
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
