import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.DSAPrivateKeySpec;

public class DSAPrivateKeySpec_3 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        BigInteger p = ((DSAPrivateKeySpec) keyPair.getPrivate().getPrivateKey()).getP();
        System.out.println("p: " + p);
    }
}
