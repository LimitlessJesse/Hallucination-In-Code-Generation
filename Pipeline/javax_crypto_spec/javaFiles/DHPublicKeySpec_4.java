import java.math.BigInteger;
import javax.crypto.spec.DHPublicKeySpec;

public class DHPublicKeySpec_4 {
    public static void main(String[] args) {
        BigInteger g = BigInteger.valueOf(5);
        BigInteger p = BigInteger.valueOf(23);
        BigInteger y = BigInteger.valueOf(15);

        DHPublicKeySpec dhPublicKeySpec = new DHPublicKeySpec(g, p, y);

        BigInteger publicValueY = dhPublicKeySpec.getY();

        System.out.println("Public Value Y: " + publicValueY);
    }
}
