import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileImageOutputStream_5 {
    public static void main(String[] args) {
        try {
            File file = new File("output.jpg");
            FileImageOutputStream output = new FileImageOutputStream(file);

            byte[] data = {0x00, 0x01, 0x02, 0x03, 0x04};
            output.write(data, 0, data.length);

            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
