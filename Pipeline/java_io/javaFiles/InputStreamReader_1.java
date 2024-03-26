import java.io.InputStreamReader;
import java.io.IOException;

public class InputStreamReader_1 {
    public static void main(String[] args) {
        InputStreamReader reader = new InputStreamReader(System.in);
        try {
            int data = reader.read();
            System.out.println("Read data: " + data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
