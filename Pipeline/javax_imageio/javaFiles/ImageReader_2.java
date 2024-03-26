import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.util.Iterator;

public class ImageReader_2 {
    public static void main(String[] args) {
        Iterator<ImageReader> readers = ImageIO.getImageReadersByFormatName("jpg");
        if (readers.hasNext()) {
            ImageReader reader = readers.next();
            try {
                int numImages = reader.getNumImages(true);
                System.out.println("Number of images: " + numImages);
            } finally {
                reader.dispose();
            }
        }
    }
}
