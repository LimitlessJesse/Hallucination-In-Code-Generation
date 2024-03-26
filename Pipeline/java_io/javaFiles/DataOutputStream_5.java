import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_5 {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.txt"))) {
            dos.writeChar('A');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
