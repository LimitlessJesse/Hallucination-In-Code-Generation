import javax.net.ssl.X509ExtendedTrustManager;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;

public class MyTrustManager extends X509ExtendedTrustManager {

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType) {
        // Implement your logic here
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType, SSLEngine engine) {
        // Implement your logic here
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        // Implement your logic here
        return null;
    }
}
