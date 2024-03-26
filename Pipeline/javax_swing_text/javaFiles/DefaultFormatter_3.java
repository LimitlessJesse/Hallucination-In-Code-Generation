import javax.swing.text.DefaultFormatter;

public class DefaultFormatter_3 {
    public static void main(String[] args) {
        DefaultFormatter formatter = new DefaultFormatter();
        String result = formatter.valueToString(123);
        System.out.println(result);
    }
}
