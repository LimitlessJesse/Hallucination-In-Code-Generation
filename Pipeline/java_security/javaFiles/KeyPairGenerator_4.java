import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECGenParameterSpec;

public class KeyPairGenerator_4 {
    public static void main(String[] args) {
        try {
            // Create a KeyPairGenerator object
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");

            // Create a ECGenParameterSpec object
            ECGenParameterSpec ecSpec = new ECGenParameterSpec("secp256k1");

            // Initialize the KeyPairGenerator with the ECGenParameterSpec
            keyPairGenerator.initialize(ecSpec);

            // Generate a KeyPair
            KeyPair keyPair = keyPairGenerator.generateKeyPair();

            // Print the public and private keys
            System.out.println("Public Key: " + keyPair.getPublic());
            System.out.println("Private Key: " + keyPair.getPrivate());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
