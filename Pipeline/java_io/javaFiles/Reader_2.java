import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class Reader_2 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        Reader reader = new StringReader(str);
        int character;
        try {
            while ((character = reader.read())!= -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
