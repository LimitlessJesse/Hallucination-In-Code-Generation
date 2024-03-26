import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_13 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("output.txt");
            DataOutputStream output = new DataOutputStream(file);

            output.writeBytes("Hello, World!");

            output.close();
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
