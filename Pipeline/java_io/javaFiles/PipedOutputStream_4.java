import java.io.IOException;
import java.io.PipedOutputStream;

public class PipedOutputStream_4 {
    public static void main(String[] args) {
        PipedOutputStream pos = new PipedOutputStream();
        try {
            pos.write(65); // 'A'
            pos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
