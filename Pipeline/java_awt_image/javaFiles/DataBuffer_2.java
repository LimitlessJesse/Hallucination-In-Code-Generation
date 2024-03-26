import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;

public class DataBuffer_2 {
    public static void main(String[] args) {
        int[] data = new int[10];
        DataBufferInt buffer = new DataBufferInt(data, data.length);
        System.out.println(buffer.getNumBanks());
    }
}
