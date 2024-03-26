import java.awt.image.DataBuffer;
import java.awt.image.DataBufferInt;

public class DataBuffer_9 {
    public static void main(String[] args) {
        DataBufferInt buffer = new DataBufferInt(new int[]{1, 2, 3, 4, 5}, 5);
        buffer.setElem(0, 2, 10);
        for (int i = 0; i < buffer.getSize(); i++) {
            System.out.println(buffer.getElem(i));
        }
    }
}
