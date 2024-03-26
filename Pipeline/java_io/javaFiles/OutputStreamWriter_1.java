import java.io.OutputStreamWriter;
import java.io.IOException;

public class OutputStreamWriter_1 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter writer = new OutputStreamWriter(System.out);
            writer.write('H');
            writer.write('i');
            writer.write('\n');
            writer.write('W');
            writer.write('o');
            writer.write('r');
            writer.write('l');
            writer.write('d');
            writer.write('\n');
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
