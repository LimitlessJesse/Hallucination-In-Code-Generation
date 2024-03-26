import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class BufferedImage_1 {
    public static void main(String[] args) {
        try {
            BufferedImage img = ImageIO.read(new File("path_to_your_image.jpg"));
            int height = img.getHeight();
            System.out.println("Height of the image: " + height);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
