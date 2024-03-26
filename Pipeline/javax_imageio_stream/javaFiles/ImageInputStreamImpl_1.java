import javax.imageio.stream.ImageInputStreamImpl;
import java.io.IOException;

public class ImageInputStreamImpl_1 {
    public static void main(String[] args) {
        ImageInputStreamImpl imageInputStream = new ImageInputStreamImpl();
        try {
            int byteRead = imageInputStream.read();
            System.out.println("Byte read: " + byteRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
