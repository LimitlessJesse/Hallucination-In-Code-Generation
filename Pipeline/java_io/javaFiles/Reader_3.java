import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Reader_3 {
    public static void main(String[] args) {
        try (Reader reader = new StringReader("Hello, World!")) {
            reader.skip(7);
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
