import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import java.io.IOException;

public class DataHandler_3 {
    public static void main(String[] args) {
        // Create a DataSource
        DataSource source = new FileDataSource("path_to_your_file");

        // Create a DataHandler
        DataHandler handler = new DataHandler(source);

        // Get the content type
        String contentType = handler.getContentType();

        System.out.println("Content Type: " + contentType);
    }
}
