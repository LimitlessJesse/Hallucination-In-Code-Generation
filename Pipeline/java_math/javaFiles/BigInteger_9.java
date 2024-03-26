import java.math.BigInteger;

public class BigInteger_9 {
    public static void main(String[] args) {
        BigInteger bigInteger = BigInteger.valueOf(100);
        BigInteger nextPrime = bigInteger.nextProbablePrime();
        System.out.println("Next probable prime: " + nextPrime);
    }
}
