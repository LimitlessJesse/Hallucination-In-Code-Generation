import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class InflaterInputStream_3 {
    public static void main(String[] args) {
        byte[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);

        try {
            inflaterInputStream.skip(5); // Skip the first 5 elements
            int value = inflaterInputStream.read(); // Read the next element
            while (value!= -1) {
                System.out.println(value);
                value = inflaterInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
