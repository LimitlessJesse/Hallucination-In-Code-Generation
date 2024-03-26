import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.KeySpec;
import java.util.Base64;

public class PKCS8EncodedKeySpec_3 {
    public static void main(String[] args) {
        try {
            // Generate a private key
            KeyFactory kf = KeyFactory.getInstance("RSA");
            KeySpec ks = new PKCS8EncodedKeySpec(Base64.getDecoder().decode("..."));
            PrivateKey privateKey = kf.generatePrivate(ks);

            // Get the format of the key
            String format = ((PKCS8EncodedKeySpec) ks).getFormat();
            System.out.println("Format: " + format);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
}
