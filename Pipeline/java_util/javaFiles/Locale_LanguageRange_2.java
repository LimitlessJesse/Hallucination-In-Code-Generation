import java.util.Locale;

public class Locale_LanguageRange_2 {
    public static void main(String[] args) {
        Locale.LanguageRange range1 = new Locale.LanguageRange("en");
        Locale.LanguageRange range2 = new Locale.LanguageRange("en");
        Locale.LanguageRange range3 = new Locale.LanguageRange("fr");

        System.out.println(range1.equals(range2)); // true
        System.out.println(range1.equals(range3)); // false
    }
}
