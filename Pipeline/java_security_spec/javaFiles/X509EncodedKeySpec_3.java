import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.security.Key;
import java.security.spec.KeySpec;
import java.util.Base64;

public class X509EncodedKeySpec_3 {
    public static void main(String[] args) {
        try {
            // Generate a public key
            String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCqGKukO1De7zhZj6+H0qtjTkVxwTCpvKe4eCZ0FPqri0cb2JZfXJ/DgYSF6vUpwmJG8wVQZKjeGc4/W7ND7crfhU242He3zQ3i9+8k8Fv1hbdPQV6bd7xlM8czC5y46EevseX8oQge+3vQCKZED/B/yVkNFLf/xBd2D05+53RlswIDAQAB";
            byte[] publicKeyBytes = Base64.getDecoder().decode(publicKey);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            KeySpec keySpec = new X509EncodedKeySpec(publicKeyBytes);
            Key key = keyFactory.generatePublic(keySpec);

            // Get the format of the key
            String format = ((X509EncodedKeySpec) keySpec).getFormat();
            System.out.println("Format: " + format);
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
}
