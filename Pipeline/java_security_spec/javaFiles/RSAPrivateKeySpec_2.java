import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.RSAPrivateKeySpec;

public class RSAPrivateKeySpec_2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // Generate a RSA key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Get the private key spec
        RSAPrivateKeySpec privateKeySpec = keyPairGenerator.getKeyFactory().getKeySpec(keyPair.getPrivate(), RSAPrivateKeySpec.class);

        // Get the modulus
        BigInteger modulus = privateKeySpec.getModulus();

        // Print the modulus
        System.out.println("Modulus: " + modulus);
    }
}
