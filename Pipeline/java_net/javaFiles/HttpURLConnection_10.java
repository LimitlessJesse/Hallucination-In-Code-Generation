import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class HttpURLConnection_10 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setInstanceFollowRedirects(false);
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
