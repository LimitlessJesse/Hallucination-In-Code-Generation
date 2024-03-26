import java.math.BigInteger;

public class BigInteger_6 {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("10");
        BigInteger num2 = new BigInteger("3");

        BigInteger remainder = num1.remainder(num2);

        System.out.println("The remainder of the division is: " + remainder);
    }
}
