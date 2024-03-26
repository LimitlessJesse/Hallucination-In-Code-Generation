import javax.imageio.stream.ImageInputStreamImpl;
import java.io.IOException;

public class ImageInputStreamImpl_2 {
    public static void main(String[] args) throws IOException {
        ImageInputStreamImpl imageInputStream = new ImageInputStreamImpl();
        byte[] buffer = new byte[1024];
        int bytesRead = imageInputStream.read(buffer);
        System.out.println("Bytes read: " + bytesRead);
    }
}
