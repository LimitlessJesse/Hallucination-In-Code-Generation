import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedOutputStream_2 {
    public static void main(String[] args) {
        PipedInputStream inputStream = new PipedInputStream();
        PipedOutputStream outputStream = new PipedOutputStream();

        try {
            outputStream.connect(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
