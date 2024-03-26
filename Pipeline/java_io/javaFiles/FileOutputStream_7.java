import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_7 {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            String s = "Hello, World!";
            byte[] b = s.getBytes();
            fos.write(b, 0, b.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
