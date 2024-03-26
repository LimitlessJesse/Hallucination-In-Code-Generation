import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStream_5 {
    public static void main(String[] args) {
        byte[] bytes = {1, 2, 3, 4, 5};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(byteArrayInputStream);

        try {
            System.out.println("Available bytes before reading: " + bufferedInputStream.available());
            bufferedInputStream.read();
            System.out.println("Available bytes after reading: " + bufferedInputStream.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
