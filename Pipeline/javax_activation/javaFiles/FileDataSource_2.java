import javax.activation.FileDataSource;
import java.io.File;
import java.io.IOException;

public class FileDataSource_2 {
    public static void main(String[] args) {
        File file = new File("path_to_your_file");
        FileDataSource fileDataSource = new FileDataSource(file);
        try {
            String contentType = fileDataSource.getContentType();
            System.out.println("Content Type: " + contentType);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
