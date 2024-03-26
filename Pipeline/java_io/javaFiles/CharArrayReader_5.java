import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_5 {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'c'};
        CharArrayReader reader = new CharArrayReader(array);

        int i;
        try {
            while ((i = reader.read())!= -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
