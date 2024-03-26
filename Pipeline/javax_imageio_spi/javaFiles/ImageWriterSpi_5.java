import javax.imageio.ImageIO;
import javax.imageio.spi.ImageWriterSpi;
import javax.imageio.ImageWriter;

public class ImageWriterSpi_5 {
    public static void main(String[] args) {
        ImageWriterSpi writerSpi = new ImageWriterSpi();
        ImageWriter writer = writerSpi.createWriterInstance();
    }
}
