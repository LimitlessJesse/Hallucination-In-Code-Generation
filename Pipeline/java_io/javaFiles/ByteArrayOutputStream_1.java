import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStream_1 {
    public static void main(String[] args) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            baos.write(1);
            baos.write(2);
            baos.write(3);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Size of ByteArrayOutputStream: " + baos.size());
    }
}
