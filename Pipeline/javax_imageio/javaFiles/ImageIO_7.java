import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.util.Iterator;

public class ImageIO_7 {
    public static void main(String[] args) {
        String mimeType = "image/jpeg";
        Iterator<ImageReader> readers = ImageIO.getImageReadersByMIMEType(mimeType);
        while (readers.hasNext()) {
            ImageReader reader = readers.next();
            System.out.println(reader.getClass().getName());
        }
    }
}
