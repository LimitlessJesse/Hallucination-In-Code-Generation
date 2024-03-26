import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStream_3 {
    public static void main(String[] args) {
        try {
            PushbackInputStream inputStream = new PushbackInputStream(System.in);
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer, 0, buffer.length);
            if (bytesRead!= -1) {
                System.out.println("Bytes read: " + bytesRead);
                System.out.println("Content: " + new String(buffer, 0, bytesRead));
            } else {
                System.out.println("No bytes read");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
