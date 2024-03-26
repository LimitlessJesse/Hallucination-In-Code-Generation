import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.DSAPrivateKeySpec;

public class DSAPrivateKeySpec_5 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
        keyPairGenerator.initialize(1024);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        DSAPrivateKeySpec dsaPrivateKeySpec = new DSAPrivateKeySpec(keyPair.getPrivate().getPrivateExponent(), keyPair.getPrivate().getParams().getP(), keyPair.getPrivate().getParams().getQ(), keyPair.getPrivate().getParams().getG());

        BigInteger g = dsaPrivateKeySpec.getG();
        System.out.println("Generator of the group: " + g);
    }
}
