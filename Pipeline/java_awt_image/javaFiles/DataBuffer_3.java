import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;

public class DataBuffer_3 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        DataBuffer buffer = new DataBufferInt(data, data.length);
        System.out.println("Size of the data buffer: " + buffer.getSize());
    }
}
