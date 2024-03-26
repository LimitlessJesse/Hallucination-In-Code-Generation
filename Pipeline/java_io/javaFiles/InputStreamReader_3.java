import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_3 {
    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        char[] buffer = new char[10];
        try {
            int read = reader.read(buffer, 0, buffer.length);
            System.out.println("Read " + read + " characters: " + new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
