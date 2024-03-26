import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;

public class HttpURLConnection_4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();
            System.out.println("Response Code: " + responseCode);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
