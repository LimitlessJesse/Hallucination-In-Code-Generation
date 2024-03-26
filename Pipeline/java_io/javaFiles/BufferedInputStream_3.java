import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStream_3 {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("file.txt"))) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = bis.read(buffer, 0, buffer.length))!= -1) {
                // Process the read bytes
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
