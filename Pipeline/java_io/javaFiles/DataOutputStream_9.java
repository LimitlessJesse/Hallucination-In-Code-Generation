import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_9 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("output.txt");
            DataOutputStream output = new DataOutputStream(file);

            output.writeInt(123456);

            output.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
