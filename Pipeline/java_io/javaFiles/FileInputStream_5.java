import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_5 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt")) {
            byte[] buffer = new byte[1024];
            int bytesRead = fis.read(buffer, 0, buffer.length);
            while (bytesRead!= -1) {
                // Process the data in the buffer
                //...
                bytesRead = fis.read(buffer, 0, buffer.length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
