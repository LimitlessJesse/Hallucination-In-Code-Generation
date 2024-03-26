import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStream_5 {
    public static void main(String[] args) {
        PushbackInputStream inputStream = null;
        try {
            // Initialize the input stream
            inputStream = new PushbackInputStream(System.in);

            // Read from the input stream
            int data = inputStream.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the input stream
            if (inputStream!= null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
