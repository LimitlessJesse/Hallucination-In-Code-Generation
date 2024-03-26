import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.Arrays;

public class PKCS8EncodedKeySpec_2 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        PKCS8EncodedKeySpec pkcs8EncodedKeySpec = new PKCS8EncodedKeySpec(keyPair.getPrivate().getEncoded());
        byte[] encoded = pkcs8EncodedKeySpec.getEncoded();

        StringBuilder sb = new StringBuilder();
        for (byte b : encoded) {
            sb.append(String.format("%02X", b));
        }
        System.out.println(sb.toString());
    }
}
