import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

public class KeyStore_PrivateKeyEntry_2 {
    public static void main(String[] args) {
        try {
            KeyStore keyStore = KeyStore.getInstance("JKS");
            keyStore.load(null, null);
            KeyStore.PrivateKeyEntry privateKeyEntry = (KeyStore.PrivateKeyEntry) keyStore.getEntry("alias", new KeyStore.PasswordProtection("password".toCharArray()));
            java.security.PrivateKey privateKey = privateKeyEntry.getPrivateKey();
            System.out.println(privateKey);
        } catch (KeyStoreException | NoSuchAlgorithmException | CertificateException | UnrecoverableKeyException e) {
            e.printStackTrace();
        }
    }
}
