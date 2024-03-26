import java.math.BigInteger;

public class BigInteger_2 {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("12345678901234567890");
        BigInteger num2 = new BigInteger("98765432109876543210");

        BigInteger sum = num1.add(num2);

        System.out.println("Sum: " + sum);
    }
}
