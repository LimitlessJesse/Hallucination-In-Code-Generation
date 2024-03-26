import java.io.PushbackInputStream;
import java.io.IOException;

public class PushbackInputStream_4 {
    public static void main(String[] args) {
        try {
            PushbackInputStream inputStream = new PushbackInputStream(System.in);
            int data = inputStream.read();
            if (data == 'a') {
                inputStream.unread(data);
                data = inputStream.read();
                System.out.println("Read: " + (char) data);
            } else {
                System.out.println("Read: " + (char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
