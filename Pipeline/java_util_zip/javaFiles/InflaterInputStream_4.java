import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class InflaterInputStream_4 {
    public static void main(String[] args) {
        byte[] data = new byte[]{1, 2, 3, 4, 5};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);

        try {
            System.out.println("Available bytes: " + inflaterInputStream.available());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
