import java.io.FileWriter;
import java.io.IOException;

public class Writer_7 {
    public static void main(String[] args) {
        FileWriter writer = null;
        try {
            writer = new FileWriter("output.txt");
            writer.write("Hello, World!");
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
