import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_6 {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("file.txt");
            // Read from the file
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream!= null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
