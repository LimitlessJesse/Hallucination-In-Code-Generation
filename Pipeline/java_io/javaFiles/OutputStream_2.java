import java.io.OutputStream;
import java.io.ByteArrayOutputStream;

public class OutputStream_2 {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        String data = "Hello, World!";
        byte[] byteArray = data.getBytes();
        outputStream.write(byteArray);
        System.out.println(outputStream.toString());
    }
}
