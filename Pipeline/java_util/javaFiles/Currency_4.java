import java.util.Currency;
import java.util.Locale;

public class Currency_4 {
    public static void main(String[] args) {
        Currency currency = Currency.getInstance("USD");
        System.out.println(currency.getDisplayName(Locale.US));
    }
}
