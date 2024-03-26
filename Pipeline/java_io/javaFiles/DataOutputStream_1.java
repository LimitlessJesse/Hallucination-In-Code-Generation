import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStream_1 {
    public static void main(String[] args) {
        try {
            FileOutputStream file = new FileOutputStream("output.txt");
            DataOutputStream output = new DataOutputStream(file);

            output.write(65); // writes the byte 65 to the output stream

            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
