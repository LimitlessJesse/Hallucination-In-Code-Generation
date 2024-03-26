import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLConnection_3 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLConnection urlConnection = url.openConnection();
            urlConnection.setDoOutput(true);
            OutputStream outputStream = urlConnection.getOutputStream();
            // Write data to the URL
            outputStream.write("Hello, World!".getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
