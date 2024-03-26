import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_11 {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.dat"))) {
            dos.writeShort(1234);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
