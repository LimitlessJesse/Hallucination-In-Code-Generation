import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageIO_1 {
    public static void main(String[] args) {
        try {
            BufferedImage img = ImageIO.read(new File("image.jpg"));
            System.out.println("Image read successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
