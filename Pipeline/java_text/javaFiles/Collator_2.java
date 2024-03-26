import java.text.Collator;
import java.util.Locale;

public class Collator_2 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance(new Locale("en", "US"));
        String source = "Hello";
        String target = "World";
        int result = collator.compare(source, target);
        System.out.println(result);
    }
}
