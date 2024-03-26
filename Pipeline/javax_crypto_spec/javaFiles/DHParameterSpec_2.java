import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;

public class DHParameterSpec_2 {
    public static void main(String[] args) {
        BigInteger p = BigInteger.probablePrime(1024, new java.util.Random());
        BigInteger g = BigInteger.valueOf(2);
        DHParameterSpec dhParamSpec = new DHParameterSpec(p, g);
        System.out.println("P: " + dhParamSpec.getP());
    }
}
