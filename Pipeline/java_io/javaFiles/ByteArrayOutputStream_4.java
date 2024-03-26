import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStream_4 {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String s = "Hello, World!";
        byte[] strToBytes = s.getBytes();

        try {
            byteArrayOutputStream.write(strToBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] byteArray = byteArrayOutputStream.toByteArray();

        for (byte b : byteArray) {
            System.out.print((char)b);
        }
    }
}
