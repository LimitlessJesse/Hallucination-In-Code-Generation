import java.text.Collator;
import java.util.Locale;

public class Collator_6 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance(Locale.getDefault());
        System.out.println(collator.hashCode());
    }
}
