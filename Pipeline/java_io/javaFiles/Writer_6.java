import java.io.Writer;
import java.io.IOException;

public class Writer_6 {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer.write("Hello, World!");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer!= null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
