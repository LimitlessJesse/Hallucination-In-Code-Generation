import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReader_3 {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        CharArrayReader reader = new CharArrayReader(arr);

        try {
            System.out.println("Skipping 5 characters...");
            reader.skip(5);

            int data = reader.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
