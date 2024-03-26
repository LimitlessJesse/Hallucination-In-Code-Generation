import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.util.Iterator;

public class ImageIO_5 {
    public static void main(String[] args) {
        String formatName = "JPEG";
        Iterator<ImageReader> readers = ImageIO.getImageReadersByFormatName(formatName);
        while (readers.hasNext()) {
            ImageReader reader = readers.next();
            System.out.println(reader.getFormatName(0));
        }
    }
}
