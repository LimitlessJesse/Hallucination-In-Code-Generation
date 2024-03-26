import javax.net.ssl.X509ExtendedTrustManager;
import java.security.cert.X509Certificate;
import javax.net.ssl.SSLEngine;
import java.security.cert.CertificateException;

public class X509ExtendedTrustManager_6 {
    public static void main(String[] args) {
        X509ExtendedTrustManager trustManager = new X509ExtendedTrustManager() {
            @Override
            public void checkClientTrusted(X509Certificate[] chain, String authType, SSLEngine engine) throws CertificateException {
                // Your implementation here
            }

            @Override
            public void checkServerTrusted(X509Certificate[] chain, String authType, SSLEngine engine) throws CertificateException {
                // Your implementation here
            }

            @Override
            public X509Certificate[] getAcceptedIssuers() {
                // Your implementation here
                return null;
            }
        };
    }
}
