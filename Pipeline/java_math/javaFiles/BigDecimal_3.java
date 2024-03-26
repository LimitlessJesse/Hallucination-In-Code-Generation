import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal_3 {
    public static void main(String[] args) {
        BigDecimal value1 = new BigDecimal("10");
        BigDecimal value2 = new BigDecimal("3");

        BigDecimal result = value1.divide(value2, 2, RoundingMode.HALF_UP);

        System.out.println("Result: " + result);
    }
}
