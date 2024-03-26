import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_2 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
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
