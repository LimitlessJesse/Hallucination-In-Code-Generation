import javax.imageio.stream.ImageOutputStreamImpl;
import java.io.IOException;

public class ImageOutputStreamImpl_5 {
    public static void main(String[] args) {
        ImageOutputStreamImpl outputStream = new ImageOutputStreamImpl();
        try {
            outputStream.write(65); // writes 'A' to the output stream
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
