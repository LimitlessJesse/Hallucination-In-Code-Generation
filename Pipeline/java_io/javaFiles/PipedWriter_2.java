import java.io.IOException;
import java.io.PipedWriter;

public class PipedWriter_2 {
    public static void main(String[] args) {
        try {
            PipedWriter writer = new PipedWriter();
            writer.write("Hello, World!");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
