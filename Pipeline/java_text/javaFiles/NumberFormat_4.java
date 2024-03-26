import java.text.NumberFormat;

public class NumberFormat_4 {
    public static void main(String[] args) {
        long number = 123456789;
        NumberFormat numberFormat = NumberFormat.getInstance();
        String formattedNumber = numberFormat.format(number);
        System.out.println(formattedNumber);
    }
}
