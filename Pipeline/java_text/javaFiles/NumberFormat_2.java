import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_2 {
    public static void main(String[] args) {
        Locale locale = new Locale("en", "US");
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        System.out.println(numberFormat.format(1234567.89));
    }
}
