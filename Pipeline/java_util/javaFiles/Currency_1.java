import java.util.Currency;

public class Currency_1 {
    public static void main(String[] args) {
        String currencyCode = "USD";
        Currency currency = Currency.getInstance(currencyCode);
        System.out.println(currency.getCurrencyCode());
    }
}
