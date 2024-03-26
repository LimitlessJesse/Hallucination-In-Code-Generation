import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriter_5 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter writer = new OutputStreamWriter(System.out);
            String str = "Hello, World!";
            writer.write(str, 7, 5);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
