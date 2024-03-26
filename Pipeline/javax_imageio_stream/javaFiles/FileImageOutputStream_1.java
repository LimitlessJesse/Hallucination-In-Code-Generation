import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileImageOutputStream_1 {
    public static void main(String[] args) {
        File file = new File("image.jpg");
        FileImageOutputStream output = null;

        try {
            output = new FileImageOutputStream(file);
            // Write some data to the output stream
            output.write(0);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (output!= null) {
                try {
                    output.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
