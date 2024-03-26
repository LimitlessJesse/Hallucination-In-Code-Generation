import java.io.StringReader;
import java.io.IOException;

public class StringReader_3 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello World!");
        try {
            reader.skip(6); // Skip the first 6 characters
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
