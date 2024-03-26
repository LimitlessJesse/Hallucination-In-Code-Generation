import java.math.BigInteger;

public class BigInteger_3 {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("100");
        BigInteger num2 = new BigInteger("50");
        BigInteger result = num1.subtract(num2);
        System.out.println("The result is: " + result);
    }
}
