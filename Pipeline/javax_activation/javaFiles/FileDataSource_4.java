import javax.activation.FileDataSource;
import java.io.File;
import java.io.IOException;

public class FileDataSource_4 {
    public static void main(String[] args) {
        File file = new File("path_to_your_file");
        FileDataSource fileDataSource = new FileDataSource(file);
        try {
            System.out.println(fileDataSource.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
