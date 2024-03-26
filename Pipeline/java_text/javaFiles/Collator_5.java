import java.text.Collator;
import java.util.Locale;

public class Collator_5 {
    public static void main(String[] args) {
        Collator collator = Collator.getInstance(new Locale("en", "US"));
        int strength = collator.getStrength();
        System.out.println("Strength: " + strength);
    }
}
