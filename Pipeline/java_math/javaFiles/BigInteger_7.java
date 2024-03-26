import java.math.BigInteger;

public class BigInteger_7 {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("100");
        BigInteger num2 = new BigInteger("200");

        int result = num1.compareTo(num2);

        if (result < 0) {
            System.out.println(num1 + " is less than " + num2);
        } else if (result == 0) {
            System.out.println(num1 + " is equal to " + num2);
        } else {
            System.out.println(num1 + " is greater than " + num2);
        }
    }
}
