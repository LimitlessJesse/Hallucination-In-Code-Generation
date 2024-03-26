import java.math.BigInteger;

public class BigInteger_4 {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("1234567890");
        BigInteger num2 = new BigInteger("9876543210");

        BigInteger product = num1.multiply(num2);

        System.out.println("Product: " + product);
    }
}
