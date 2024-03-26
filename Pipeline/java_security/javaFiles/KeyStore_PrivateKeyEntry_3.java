import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;

public class KeyStore_PrivateKeyEntry_3 {
    public static void main(String[] args) {
        try {
            // Load the keystore
            KeyStore ks = KeyStore.getInstance("JKS");
            ks.load(new java.io.FileInputStream("keystore.jks"), "password".toCharArray());

            // Get the private key entry
            KeyStore.PrivateKeyEntry pkEntry = (KeyStore.PrivateKeyEntry) ks.getEntry("alias", new KeyStore.PasswordProtection("password".toCharArray()));

            // Get the certificate chain
            Certificate[] chain = pkEntry.getCertificateChain();

            // Print the chain
            for (Certificate cert : chain) {
                System.out.println(cert);
            }
        } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException | UnrecoverableKeyException | java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
