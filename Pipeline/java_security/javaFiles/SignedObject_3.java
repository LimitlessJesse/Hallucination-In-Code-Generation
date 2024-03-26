import java.security.*;
import java.security.Signature;
import java.security.SignatureException;

public class SignedObject_3 {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        // Create a new KeyPairGenerator
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Create a new Signature object
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(keyPair.getPrivate());

        // Update the signature with some data
        signature.update("Hello, World!".getBytes());

        // Generate the signature
        byte[] signedBytes = signature.sign();

        // Create a new SignedObject
        SignedObject signedObject = new SignedObject(signedBytes, signature);

        // Get the signature
        byte[] signatureBytes = signedObject.getSignature();

        // Print the signature
        System.out.println("Signature: " + new String(signatureBytes));
    }
}
