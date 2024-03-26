import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class SignedObject_2 {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchProviderException, SignatureException, InvalidKeyException {
        // Generate a private/public key pair
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(1024);
        KeyPair pair = keyGen.generateKeyPair();
        PrivateKey privateKey = pair.getPrivate();
        PublicKey publicKey = pair.getPublic();

        // Create a signature object and initialize it with the private key
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initSign(privateKey);

        // Update and sign the data
        byte[] data = "Hello, World!".getBytes();
        signature.update(data);
        byte[] signatureBytes = signature.sign();

        // Now, create a SignedObject with the data and signature
        SignedObject signedObject = new SignedObject(data, signatureBytes, publicKey);

        // Now, get the object back
        Object object = signedObject.getObject();

        // Print the object
        System.out.println(new String((byte[]) object));
    }
}
