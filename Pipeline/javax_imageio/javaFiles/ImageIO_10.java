import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import java.util.Iterator;

public class ImageIO_10 {
    public static void main(String[] args) {
        try {
            Iterator<ImageWriter> iterator = ImageIO.getImageWritersBySuffix("jpg");
            while (iterator.hasNext()) {
                ImageWriter writer = iterator.next();
                System.out.println(writer.getClass().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
