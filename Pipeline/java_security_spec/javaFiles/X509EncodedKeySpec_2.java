import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.X509EncodedKeySpec;

public class X509EncodedKeySpec_2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(keyPair.getPublic().getEncoded());
        byte[] encoded = x509EncodedKeySpec.getEncoded();

        System.out.println(new String(encoded));
    }
}
