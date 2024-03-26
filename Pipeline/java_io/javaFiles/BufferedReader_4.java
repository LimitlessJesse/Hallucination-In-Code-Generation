import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

public class BufferedReader_4 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        BufferedReader reader = new BufferedReader(new StringReader(str));

        try {
            reader.skip(7); // Skip the first 7 characters
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
