import java.math.BigInteger;
import javax.crypto.spec.DHPrivateKeySpec;

public class DHPrivateKeySpec_2 {
    public static void main(String[] args) {
        BigInteger privateValue = new BigInteger("12345678901234567890");
        DHPrivateKeySpec dhPrivateKeySpec = new DHPrivateKeySpec(privateValue, null, null);
        BigInteger p = dhPrivateKeySpec.getP();
        System.out.println("Private Value: " + p);
    }
}
