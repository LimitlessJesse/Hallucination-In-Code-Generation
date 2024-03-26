import java.math.BigInteger;

public class BigInteger_5 {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("100");
        BigInteger num2 = new BigInteger("20");
        BigInteger result = num1.divide(num2);
        System.out.println("Result: " + result);
    }
}
