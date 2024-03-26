import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.RSAPrivateKeySpec;

public class RSAPrivateKeySpec_3 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        BigInteger privateExponent = keyPair.getPrivate().getPrivateExponent();
        System.out.println("Private Exponent: " + privateExponent);
    }
}
