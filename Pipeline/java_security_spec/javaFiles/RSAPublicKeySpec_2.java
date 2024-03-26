import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.RSAPublicKeySpec;

public class RSAPublicKeySpec_2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // Generate a RSA key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Get the modulus of the public key
        BigInteger modulus = keyPair.getPublic().getModulus();
        System.out.println("Modulus: " + modulus);
    }
}
