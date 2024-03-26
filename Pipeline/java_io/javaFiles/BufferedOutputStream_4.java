import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStream_4 {
    public static void main(String[] args) {
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("output.txt"))) {
            byte[] data = "Hello, World!".getBytes();
            bos.write(data, 0, data.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
