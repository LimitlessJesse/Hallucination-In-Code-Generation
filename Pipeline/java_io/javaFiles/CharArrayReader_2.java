import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_2 {
    public static void main(String[] args) {
        char[] array = {'H', 'e', 'l', 'l', 'o'};
        CharArrayReader reader = new CharArrayReader(array);
        int i;
        try {
            while ((i = reader.read())!= -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
