import java.io.IOException;
import java.io.InputStream;

public class InputStream_5 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = System.in;
            int availableBytes = inputStream.available();
            System.out.println("Available bytes: " + availableBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
