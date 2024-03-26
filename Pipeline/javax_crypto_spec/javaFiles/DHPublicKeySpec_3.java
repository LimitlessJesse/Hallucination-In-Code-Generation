import java.math.BigInteger;
import javax.crypto.spec.DHPublicKeySpec;

public class DHPublicKeySpec_3 {
    public static void main(String[] args) {
        BigInteger g = BigInteger.valueOf(5);
        BigInteger p = BigInteger.probablePrime(1024, new java.util.Random());
        DHPublicKeySpec dhPublicKeySpec = new DHPublicKeySpec(g, p);
        BigInteger pValue = dhPublicKeySpec.getP();
        System.out.println("The prime modulus of the public key is: " + pValue);
    }
}
