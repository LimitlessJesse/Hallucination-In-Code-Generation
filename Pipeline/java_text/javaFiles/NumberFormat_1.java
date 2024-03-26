import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_1 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance(Locale.US);
        System.out.println(nf.format(1234567.89));
    }
}
