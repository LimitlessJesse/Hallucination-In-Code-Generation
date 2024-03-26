import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import java.util.Iterator;

public class ImageIO_8 {
    public static void main(String[] args) {
        Iterator<ImageWriter> iterator = ImageIO.getImageWritersByMIMEType("image/jpeg");
        while (iterator.hasNext()) {
            ImageWriter writer = iterator.next();
            System.out.println(writer.getClass().getName());
        }
    }
}
