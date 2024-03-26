import java.time.format.DecimalStyle;

public class DecimalStyle_3 {
    public static void main(String[] args) {
        DecimalStyle decimalStyle = DecimalStyle.getInstance();
        char decimalSeparator = decimalStyle.getDecimalSeparator();
        System.out.println("Decimal Separator: " + decimalSeparator);
    }
}
