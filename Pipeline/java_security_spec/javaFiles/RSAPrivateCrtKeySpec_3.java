import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.spec.RSAPrivateCrtKeySpec;

public class RSAPrivateCrtKeySpec_3 {
    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        RSAPrivateCrtKeySpec privateKeySpec = keyPairGenerator.getKeyFactory().getKeySpec(keyPair.getPrivate(), RSAPrivateCrtKeySpec.class);
        BigInteger publicExponent = privateKeySpec.getPublicExponent();

        System.out.println("Public Exponent: " + publicExponent);
    }
}
