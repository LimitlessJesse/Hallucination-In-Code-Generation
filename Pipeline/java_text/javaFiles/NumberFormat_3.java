import java.text.NumberFormat;

public class NumberFormat_3 {
    public static void main(String[] args) {
        double number = 123456.789;
        NumberFormat nf = NumberFormat.getInstance();
        String formattedNumber = nf.format(number);
        System.out.println(formattedNumber);
    }
}
