import java.math.BigInteger;
import javax.crypto.spec.DHPrivateKeySpec;

public class DHPrivateKeySpec_3 {
    public static void main(String[] args) {
        BigInteger g = new BigInteger("10");
        DHPrivateKeySpec dhPrivateKeySpec = new DHPrivateKeySpec(g, 1024, 1024);
        System.out.println(dhPrivateKeySpec.getG());
    }
}
