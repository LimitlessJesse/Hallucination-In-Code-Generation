import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_6 {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            String s = "Hello, World!";
            byte[] b = s.getBytes();
            fos.write(b);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
