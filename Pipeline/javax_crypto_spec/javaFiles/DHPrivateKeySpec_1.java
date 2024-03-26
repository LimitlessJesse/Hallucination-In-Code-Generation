import java.math.BigInteger;
import javax.crypto.spec.DHPrivateKeySpec;

public class DHPrivateKeySpec_1 {
    public static void main(String[] args) {
        BigInteger privateValue = new BigInteger("1234567890");
        DHPrivateKeySpec dhPrivateKeySpec = new DHPrivateKeySpec(privateValue, 1024, 1);
        BigInteger x = dhPrivateKeySpec.getX();
        System.out.println("Private Value x: " + x);
    }
}
