import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_12 {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.txt"))) {
            dos.writeUTF("Hello, World!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
