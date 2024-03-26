import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_8 {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.dat"))) {
            dos.writeFloat(123.45f);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
