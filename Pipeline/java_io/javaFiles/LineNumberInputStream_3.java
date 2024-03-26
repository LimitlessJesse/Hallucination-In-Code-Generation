import java.io.LineNumberInputStream;
import java.io.InputStream;
import java.io.IOException;

public class LineNumberInputStream_3 {
    public static void main(String[] args) {
        InputStream inputStream = new LineNumberInputStream(System.in);
        try {
            int data = inputStream.read();
            System.out.println("Data read: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
