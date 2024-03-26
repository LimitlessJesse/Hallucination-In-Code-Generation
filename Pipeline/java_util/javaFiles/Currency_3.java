import java.util.Currency;
import java.util.Locale;

public class Currency_3 {
    public static void main(String[] args) {
        Currency currency = Currency.getInstance(Locale.US);
        System.out.println(currency.getDisplayName());
    }
}
