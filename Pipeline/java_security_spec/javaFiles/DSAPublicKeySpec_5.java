import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.DSAPublicKeySpec;

public class DSAPublicKeySpec_5 {
    public static void main(String[] args) throws Exception {
        // Generate a DSA key pair
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Get the public key
        DSAPublicKeySpec publicKeySpec = keyPairGenerator.getKeyFactory().getKeySpec(keyPair.getPublic(), DSAPublicKeySpec.class);

        // Get the y value
        BigInteger y = publicKeySpec.getY();

        System.out.println("Y value: " + y);
    }
}
