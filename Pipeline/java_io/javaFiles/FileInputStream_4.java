import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_4 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("file.txt")) {
            byte[] buffer = new byte[1024];
            int bytesRead = fis.read(buffer);
            while (bytesRead!= -1) {
                // Process the data in the buffer
                //...
                bytesRead = fis.read(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
