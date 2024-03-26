import javax.imageio.stream.FileImageOutputStream;
import java.io.File;
import java.io.IOException;

public class FileImageOutputStream_3 {
    public static void main(String[] args) {
        try {
            FileImageOutputStream output = new FileImageOutputStream(new File("output.jpg"));
            output.write(0); // Write a byte to the output stream
            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
