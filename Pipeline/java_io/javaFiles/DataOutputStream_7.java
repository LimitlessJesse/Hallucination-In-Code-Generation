import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_7 {
    public static void main(String[] args) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.dat"))) {
            double value = 123.456;
            dos.writeDouble(value);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
