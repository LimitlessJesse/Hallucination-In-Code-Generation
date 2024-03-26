import java.util.Locale;

public class Locale_Builder_3 {
    public static void main(String[] args) {
        Locale locale = new Locale.Builder().setRegion("US").build();
        System.out.println(locale);
    }
}
