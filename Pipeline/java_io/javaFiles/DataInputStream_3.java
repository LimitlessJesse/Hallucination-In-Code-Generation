import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStream_3 {
    public static void main(String[] args) {
        try (DataInputStream dis = new DataInputStream(new FileInputStream("file.txt"))) {
            byte[] buffer = new byte[1024];
            int bytesRead = dis.read(buffer, 0, buffer.length);
            System.out.println("Bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
