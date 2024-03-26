import java.util.Locale;

public class Locale_Builder_5 {
    public static void main(String[] args) {
        Locale locale = new Locale.Builder()
               .setLanguage("en")
               .setScript("Latn")
               .build();

        System.out.println(locale);
    }
}
