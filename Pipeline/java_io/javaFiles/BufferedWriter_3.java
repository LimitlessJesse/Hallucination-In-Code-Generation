import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter_3 {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            char[] array = {'H', 'e', 'l', 'l', 'o','', 'W', 'o', 'r', 'l', 'd', '!'};
            writer.write(array, 0, array.length);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
