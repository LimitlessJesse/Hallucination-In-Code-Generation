import javax.imageio.stream.ImageInputStream;
import javax.imageio.spi.ImageInputStreamSpi;
import java.io.File;
import java.io.IOException;

public class ImageInputStreamSpi_2 {
    public static void main(String[] args) {
        ImageInputStreamSpi spi = new ImageInputStreamSpi() {
            // Implement the methods here
        };

        try {
            ImageInputStream inputStream = spi.createInputStreamInstance(new File("image.jpg"), true, new File("cache"));
            // Use the inputStream
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
