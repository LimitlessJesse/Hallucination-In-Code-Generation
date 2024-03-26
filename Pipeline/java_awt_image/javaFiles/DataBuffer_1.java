import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class DataBuffer_1 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        DataBufferInt buffer = (DataBufferInt) image.getRaster().getDataBuffer();

        // Set a pixel value
        buffer.setElem(0, 0, 0xFF0000); // Red
        buffer.setElem(0, 1, 0x00FF00); // Green
        buffer.setElem(0, 2, 0x0000FF); // Blue

        // Get a pixel value
        int pixel = buffer.getElem(0, 0);
        System.out.println(Integer.toHexString(pixel)); // Output: ff0000
    }
}
