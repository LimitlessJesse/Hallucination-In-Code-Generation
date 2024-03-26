import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import java.net.URL;

public class HttpsURLConnection_1 {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com");
        HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

        // Create a SSLSocketFactory
        SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();

        // Set the SSLSocketFactory
        conn.setSSLSocketFactory(sslSocketFactory);

        // Now you can use conn to make HTTPS requests
    }
}
