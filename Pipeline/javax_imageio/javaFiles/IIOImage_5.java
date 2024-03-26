import javax.imageio.IIOImage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class IIOImage_5 {
    public static void main(String[] args) {
        try {
            BufferedImage image = ImageIO.read(new File("image.jpg"));
            IIOImage iioImage = new IIOImage(image, null, null);
            iioImage.setRenderedImage(image);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
