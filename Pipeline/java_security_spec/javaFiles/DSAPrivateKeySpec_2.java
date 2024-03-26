import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.DSAPrivateKeySpec;

public class DSAPrivateKeySpec_2 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        DSAPrivateKeySpec privateKeySpec = keyPairGenerator.getKeyFactory().getKeySpec(keyPair.getPrivate(), DSAPrivateKeySpec.class);

        BigInteger x = privateKeySpec.getX();
        System.out.println("Private key value: " + x);
    }
}
