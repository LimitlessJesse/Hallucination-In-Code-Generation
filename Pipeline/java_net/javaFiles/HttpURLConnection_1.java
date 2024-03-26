import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class HttpURLConnection_1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();

            // Do something with the connection...

            // Disconnect from the server
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
