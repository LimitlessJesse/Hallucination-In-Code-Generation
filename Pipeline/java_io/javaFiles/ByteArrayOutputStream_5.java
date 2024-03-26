import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStream_5 {
    public static void main(String[] args) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        try {
            outputStream.write(65); // ASCII value of 'A'
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(outputStream.toString());
    }
}
