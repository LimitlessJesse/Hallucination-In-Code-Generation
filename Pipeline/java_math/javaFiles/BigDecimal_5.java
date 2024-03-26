import java.math.BigDecimal;

public class BigDecimal_5 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("10.5");
        BigDecimal b = new BigDecimal("5.2");
        BigDecimal result = a.subtract(b);
        System.out.println("The result is: " + result);
    }
}
