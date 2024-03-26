import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.zip.InflaterInputStream;

public class InflaterInputStream_1 {
    public static void main(String[] args) {
        byte[] data = { 0x01, 0x02, 0x03, 0x04, 0x05 };
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        InflaterInputStream inflaterInputStream = new InflaterInputStream(byteArrayInputStream);

        byte[] buffer = new byte[5];
        try {
            int bytesRead = inflaterInputStream.read(buffer, 0, buffer.length);
            System.out.println("Bytes read: " + bytesRead);
            for (byte b : buffer) {
                System.out.print(b + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
