import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class EncodedKeySpec_2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // Generate a key pair
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(1024);
        KeyPair pair = keyGen.generateKeyPair();

        // Get the public key
        java.security.Key publicKey = pair.getPublic();

        // Get the encoded form of the public key
        EncodedKeySpec publicKeySpec = new X509EncodedKeySpec(publicKey.getEncoded());

        // Print the encoded form
        System.out.println(new String(publicKeySpec.getEncoded()));
    }
}
