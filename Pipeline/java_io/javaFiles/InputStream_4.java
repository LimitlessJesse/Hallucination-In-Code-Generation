import java.io.IOException;
import java.io.InputStream;

public class InputStream_4 {
    public static void main(String[] args) {
        try {
            InputStream inputStream = System.in;
            long bytesSkipped = inputStream.skip(10);
            System.out.println("Bytes skipped: " + bytesSkipped);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
