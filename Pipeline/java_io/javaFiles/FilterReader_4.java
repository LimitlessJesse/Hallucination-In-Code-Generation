import java.io.FileReader;
import java.io.IOException;
import java.io.FilterReader;

public class FilterReader_4 {
    public static void main(String[] args) {
        try (FilterReader reader = new FileReader("file.txt")) {
            while (reader.ready()) {
                System.out.print((char) reader.read());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
