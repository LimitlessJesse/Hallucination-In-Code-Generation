import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStream_1 {
    public static void main(String[] args) {
        try {
            PushbackInputStream inputStream = new PushbackInputStream(System.in);
            int data = inputStream.read();
            if (data!= -1) {
                System.out.println("Read: " + (char) data);
                inputStream.unread(data);
            } else {
                System.out.println("End of stream");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
