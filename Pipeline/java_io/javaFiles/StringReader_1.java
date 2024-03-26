import java.io.StringReader;
import java.io.IOException;

public class StringReader_1 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello, World!");
        int c;
        try {
            while ((c = reader.read())!= -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
