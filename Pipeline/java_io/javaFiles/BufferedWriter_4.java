import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_4 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hello, World!", 0, 5);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
