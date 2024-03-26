import java.awt.image.DataBufferInt;

public class DataBufferInt_1 {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        DataBufferInt buffer = new DataBufferInt(data, data.length);
        int value = buffer.getElem(0, 2); // get the int value at index 2
        System.out.println(value); // prints: 3
    }
}
