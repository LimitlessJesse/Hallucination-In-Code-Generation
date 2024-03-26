import javax.imageio.stream.FileImageInputStream;
import java.io.File;
import java.io.IOException;

public class FileImageInputStream_2 {
    public static void main(String[] args) {
        try {
            File file = new File("path_to_your_file");
            FileImageInputStream inputStream = new FileImageInputStream(file);
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer, 0, buffer.length);
            while (bytesRead!= -1) {
                // process the bytes in the buffer
                bytesRead = inputStream.read(buffer, 0, buffer.length);
            }
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
