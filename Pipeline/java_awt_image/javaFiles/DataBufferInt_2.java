import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class DataBufferInt_2 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_RGB);
        DataBufferInt buffer = (DataBufferInt) image.getRaster().getDataBuffer();
        buffer.setElem(0, 12345678);
        System.out.println(buffer.getElem(0));
    }
}
