import java.text.Collator;
import java.util.Locale;

public class Collator_7 {
    public static void main(String[] args) {
        Collator collator1 = Collator.getInstance(new Locale("en", "US"));
        Collator collator2 = Collator.getInstance(new Locale("en", "US"));
        Collator collator3 = Collator.getInstance(new Locale("fr", "FR"));

        System.out.println(collator1.equals(collator2)); // true
        System.out.println(collator1.equals(collator3)); // false
    }
}
