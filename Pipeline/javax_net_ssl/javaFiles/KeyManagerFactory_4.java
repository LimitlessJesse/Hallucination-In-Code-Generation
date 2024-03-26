import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

public class KeyManagerFactory_4 {
    public static void main(String[] args) {
        try {
            // Load the keystore
            KeyStore ks = KeyStore.getInstance("JKS");
            ks.load(new java.io.FileInputStream("keystore.jks"), "password".toCharArray());

            // Get the KeyManagerFactory
            KeyManagerFactory kmf = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            kmf.init(ks, "password".toCharArray());

            // Get the KeyManagers
            KeyManager[] keyManagers = kmf.getKeyManagers();

            // Print the KeyManagers
            for (KeyManager keyManager : keyManagers) {
                System.out.println(keyManager);
            }
        } catch (KeyStoreException | NoSuchAlgorithmException | UnrecoverableKeyException | CertificateException | java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
