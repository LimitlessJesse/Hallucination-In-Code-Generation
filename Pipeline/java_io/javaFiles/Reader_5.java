import java.io.FileReader;
import java.io.IOException;

public class Reader_5 {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("file.txt");
            // Read from file
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader!= null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
