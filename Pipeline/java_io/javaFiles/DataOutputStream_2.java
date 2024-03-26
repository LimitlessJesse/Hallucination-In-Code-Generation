import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_2 {
    public static void main(String[] args) {
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("output.dat"))) {
            out.writeBoolean(true);
            out.writeBoolean(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
