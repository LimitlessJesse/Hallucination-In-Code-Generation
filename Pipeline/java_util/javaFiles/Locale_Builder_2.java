import java.util.Locale;

public class Locale_Builder_2 {
    public static void main(String[] args) {
        Locale locale = new Locale.Builder().setLanguage("en").setRegion("US").build();
        System.out.println(locale);
    }
}
