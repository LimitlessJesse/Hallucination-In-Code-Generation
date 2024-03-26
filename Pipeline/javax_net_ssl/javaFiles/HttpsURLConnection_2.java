import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.HostnameVerifier;
import java.net.URL;

public class HttpsURLConnection_2 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://example.com");
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

        // Create a custom hostname verifier
        HostnameVerifier hostnameVerifier = (hostname, session) -> {
            // Custom verification logic here
            return true;
        };

        // Set the hostname verifier
        conn.setHostnameVerifier(hostnameVerifier);
    }
}
