import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_3 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter writer = new OutputStreamWriter(System.out);
            char[] chars = {'H', 'e', 'l', 'l', 'o'};
            writer.write(chars, 0, chars.length);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
