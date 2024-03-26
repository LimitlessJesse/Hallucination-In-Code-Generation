import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;

public class URL_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            URLConnection connection = url.openConnection();
            InputStream inputStream = connection.getInputStream();
            // Read from inputStream
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
