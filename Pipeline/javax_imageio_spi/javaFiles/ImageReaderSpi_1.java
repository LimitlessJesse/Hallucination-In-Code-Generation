import javax.imageio.spi.ImageReaderSpi;

public class ImageReaderSpi_1 {
    public static void main(String[] args) {
        ImageReaderSpi imageReaderSpi = new ImageReaderSpi() {
            @Override
            public boolean canDecodeInput(Object input) {
                // Implement your logic here
                return false;
            }
        };

        // Use the canDecodeInput method
        boolean canDecode = imageReaderSpi.canDecodeInput(new Object());
        System.out.println("Can decode input: " + canDecode);
    }
}
