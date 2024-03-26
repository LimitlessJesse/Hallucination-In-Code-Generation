import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class KeyPairGenerator_2 {
    public static void main(String[] args) {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
