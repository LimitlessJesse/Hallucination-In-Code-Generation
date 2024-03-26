import java.io.PipedWriter;
import java.io.IOException;

public class PipedWriter_3 {
    public static void main(String[] args) {
        try {
            PipedWriter writer = new PipedWriter();
            writer.write('H');
            writer.write('e');
            writer.write('l');
            writer.write('l');
            writer.write('o');
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
