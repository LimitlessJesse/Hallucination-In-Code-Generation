import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.RSAPublicKeySpec;

public class RSAPublicKeySpec_3 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        // Generate a key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Get the public key
        RSAPublicKeySpec publicKeySpec = keyPairGenerator.getKeyFactory().getKeySpec(keyPair.getPublic(), RSAPublicKeySpec.class);

        // Get the public exponent
        BigInteger publicExponent = publicKeySpec.getPublicExponent();

        System.out.println("Public Exponent: " + publicExponent);
    }
}
