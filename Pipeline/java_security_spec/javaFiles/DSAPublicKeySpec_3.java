import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.DSAPublicKeySpec;

public class DSAPublicKeySpec_3 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        DSAPublicKeySpec publicKeySpec = keyPairGenerator.getKeyFactory().getKeySpec(keyPair.getPublic(), DSAPublicKeySpec.class);
        BigInteger p = publicKeySpec.getP();

        System.out.println("Public value p: " + p);
    }
}
