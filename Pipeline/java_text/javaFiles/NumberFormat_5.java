import java.text.NumberFormat;
import java.text.ParseException;

public class NumberFormat_5 {
    public static void main(String[] args) {
        NumberFormat nf = NumberFormat.getInstance();
        String source = "123456.78";
        try {
            Number number = nf.parse(source);
            System.out.println(number);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
