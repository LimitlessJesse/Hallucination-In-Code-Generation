import javax.net.ssl.KeyManagerFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

public class KeyManagerFactory_2 {
    public static void main(String[] args) {
        try {
            KeyStore keyStore = KeyStore.getInstance("JKS");
            char[] password = "password".toCharArray();
            KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            keyManagerFactory.init(keyStore, password);
        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException e) {
            e.printStackTrace();
        }
    }
}
