import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class URLConnection_4 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://example.com");
        URLConnection conn = url.openConnection();

        // Set a custom header
        conn.setRequestProperty("User-Agent", "Mozilla/5.0");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        while ((inputLine = in.readLine())!= null) {
            System.out.println(inputLine);
        }
        in.close();
    }
}
