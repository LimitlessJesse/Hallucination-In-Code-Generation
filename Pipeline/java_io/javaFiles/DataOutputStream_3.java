import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_3 {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.dat"))) {
            dos.writeByte(127);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
