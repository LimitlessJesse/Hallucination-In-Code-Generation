import java.util.Currency;

public class Currency_2 {
    public static void main(String[] args) {
        Currency currency = Currency.getInstance("USD");
        String currencyCode = currency.getCurrencyCode();
        System.out.println("Currency Code: " + currencyCode);
    }
}
