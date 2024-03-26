import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.activation.URLDataSource;

public class URLDataSource_2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLDataSource dataSource = (URLDataSource) url.getContent();
            InputStream inputStream = dataSource.getInputStream();

            // Now you can read from the inputStream
            // For example, you can read the content of the URL
            int data = inputStream.read();
            while (data!= -1) {
                System.out.print((char) data);
                data = inputStream.read();
            }

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
