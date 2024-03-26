import java.net.URL;
import java.net.URLConnection;
import java.io.IOException;

public class URLConnection_1 {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.example.com");
            URLConnection conn = url.openConnection();
            conn.connect();
            System.out.println("Connection established successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
