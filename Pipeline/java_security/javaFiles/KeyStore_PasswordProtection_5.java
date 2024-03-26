import java.security.KeyStore;
import java.security.KeyStore.PasswordProtection;

public class KeyStore_PasswordProtection_5 {
    public static void main(String[] args) {
        KeyStore keyStore = KeyStore.getInstance("JCEKS");
        PasswordProtection passwordProtection = new PasswordProtection("password".toCharArray());
        keyStore.setKeyEntry("alias", "secret".toCharArray(), passwordProtection);

        passwordProtection.destroy();
    }
}
