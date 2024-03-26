import java.io.PipedInputStream;
import java.io.IOException;

public class PipedInputStream_3 {
    public static void main(String[] args) {
        try {
            PipedInputStream pipedInputStream = new PipedInputStream();
            pipedInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
