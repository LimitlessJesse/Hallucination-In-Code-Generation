import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public class HttpsURLConnection_4 {
    public static void main(String[] args) {
        SSLSocketFactory factory = null; // replace with your SSLSocketFactory
        HttpsURLConnection.setDefaultSSLSocketFactory(factory);
    }
}
