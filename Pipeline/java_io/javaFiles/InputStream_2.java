import java.io.IOException;
import java.io.InputStream;

public class InputStream_2 {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        byte[] buffer = new byte[1024];
        try {
            int bytesRead = inputStream.read(buffer);
            if (bytesRead!= -1) {
                System.out.write(buffer, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
