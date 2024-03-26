import java.awt.image.DataBuffer;
import java.awt.image.DataBufferUShort;

public class DataBufferUShort_2 {
    public static void main(String[] args) {
        DataBuffer buffer = new DataBufferUShort(10);
        buffer.setElem(0, 5, 100);
        System.out.println(buffer.getElem(0, 5));
    }
}
