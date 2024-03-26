import javax.activation.FileDataSource;
import java.io.IOException;
import java.io.OutputStream;

public class FileDataSource_5 {
    public static void main(String[] args) {
        FileDataSource fileDataSource = new FileDataSource("path_to_your_file");
        try {
            OutputStream outputStream = fileDataSource.getOutputStream();
            // Write to the output stream
            outputStream.write("Hello, World!".getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
