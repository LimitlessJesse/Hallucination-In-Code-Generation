import java.net.URL;
import java.net.URLConnection;
import java.io.InputStream;
import java.io.IOException;

public class URLConnection_2 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();

            // Read from the input stream (here we just print it)
            int data;
            while ((data = inputStream.read())!= -1) {
                System.out.print((char) data);
            }

            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
