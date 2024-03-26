import java.io.StringReader;
import java.io.IOException;

public class StringReader_2 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello, World!");
        char[] buffer = new char[5];

        try {
            int charsRead = reader.read(buffer, 0, buffer.length);
            System.out.println("Chars read: " + charsRead);
            System.out.println("Buffer content: " + new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
