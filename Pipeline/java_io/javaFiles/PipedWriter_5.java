import java.io.IOException;
import java.io.PipedWriter;

public class PipedWriter_5 {
    public static void main(String[] args) {
        try {
            PipedWriter writer = new PipedWriter();
            writer.write("Hello, World!".toCharArray(), 0, 13);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
