import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import javax.activation.URLDataSource;

public class URLDataSource_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLDataSource dataSource = (URLDataSource) url.getContent();
            OutputStream outputStream = dataSource.getOutputStream();

            // Write data to the output stream
            String data = "Hello, World!";
            outputStream.write(data.getBytes());

            // Close the output stream
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
