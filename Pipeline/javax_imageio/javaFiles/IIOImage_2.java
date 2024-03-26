import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

public class IIOImage_2 {
    public static void main(String[] args) {
        try {
            // Load an image
            IIOImage image = new IIOImage(ImageIO.read(new File("image.jpg")), null, null);

            // Get the rendered image
            RenderedImage renderedImage = image.getRenderedImage();

            // Do something with the rendered image...

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
