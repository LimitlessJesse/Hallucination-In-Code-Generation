import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_14 {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.txt"))) {
            dos.writeChars("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
