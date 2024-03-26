import java.util.Currency;
import java.util.Locale;

public class Currency_5 {
    public static void main(String[] args) {
        Currency currency = Currency.getInstance(Locale.US);
        int defaultFractionDigits = currency.getDefaultFractionDigits();
        System.out.println("Default fraction digits for US currency: " + defaultFractionDigits);
    }
}
