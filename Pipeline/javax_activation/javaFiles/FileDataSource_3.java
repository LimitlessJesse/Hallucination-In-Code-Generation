import javax.activation.FileDataSource;
import java.io.IOException;
import java.io.InputStream;

public class FileDataSource_3 {
    public static void main(String[] args) {
        try {
            FileDataSource fileDataSource = new FileDataSource("path_to_your_file");
            InputStream inputStream = fileDataSource.getInputStream();
            // Now you can use the inputStream for reading the file content.
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
