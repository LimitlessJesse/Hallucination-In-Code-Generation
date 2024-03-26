import java.io.PushbackReader;
import java.io.StringReader;
import java.io.IOException;

public class PushbackReader_1 {
    public static void main(String[] args) {
        try (PushbackReader reader = new PushbackReader(new StringReader("Hello, World!"))) {
            int c = reader.read();
            if (c == 'H') {
                reader.unread('h');
                c = reader.read();
            }
            System.out.println((char) c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
