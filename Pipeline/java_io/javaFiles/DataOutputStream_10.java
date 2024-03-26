import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_10 {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.dat"))) {
            dos.writeLong(1234567890L);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
