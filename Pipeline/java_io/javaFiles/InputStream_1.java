import java.io.IOException;
import java.io.InputStream;

public class InputStream_1 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        try {
            int data = inputStream.read();
            System.out.println("Data read: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
