import java.io.StringReader;
import java.io.IOException;

public class StringReader_5 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello World");
        try {
            int data = reader.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = reader.read();
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
