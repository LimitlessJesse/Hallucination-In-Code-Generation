import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_1 {
    public static void main(String[] args) {
        char[] array = {'H', 'e', 'l', 'l', 'o','', 'W', 'o', 'r', 'l', 'd', '!', '\0'};
        CharArrayReader reader = new CharArrayReader(array);
        char[] buffer = new char[10];
        try {
            int numCharsRead = reader.read(buffer, 0, buffer.length);
            System.out.println("Number of characters read: " + numCharsRead);
            System.out.println("Content read: " + new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
