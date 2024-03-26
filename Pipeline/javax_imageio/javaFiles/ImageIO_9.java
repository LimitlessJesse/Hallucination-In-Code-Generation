import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import java.util.Iterator;

public class ImageIO_9 {
    public static void main(String[] args) {
        Iterator<ImageReader> iterator = ImageIO.getImageReadersBySuffix("jpg");
        while (iterator.hasNext()) {
            ImageReader reader = iterator.next();
            System.out.println(reader.getClass().getName());
        }
    }
}
