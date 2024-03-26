import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.HostnameVerifier;

public class HttpsURLConnection_3 {
    public static void main(String[] args) {
        HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, javax.net.ssl.SSLSession sslSession) {
                return true; // accept all hostnames
            }
        });
    }
}
