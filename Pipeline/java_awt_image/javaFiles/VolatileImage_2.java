import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.VolatileImage;

public class VolatileImage_2 {
    public static void main(String[] args) {
        BufferedImage bufferedImage = new BufferedImage(100, 100, BufferedImage.TYPE_INT_RGB);
        Graphics graphics = bufferedImage.getGraphics();
        graphics.drawRect(0, 0, 100, 100);
        graphics.dispose();

        VolatileImage volatileImage = bufferedImage.getVolatileImage();
        int height = volatileImage.getHeight();

        System.out.println("Height of the image: " + height);
    }
}
