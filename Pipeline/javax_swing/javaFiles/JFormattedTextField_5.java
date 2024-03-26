import javax.swing.JFormattedTextField;
import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;

public class JFormattedTextField_5 {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        JFormattedTextField field = new JFormattedTextField(formatter);

        field.setValue(10);
        Object value = field.getValue();

        System.out.println("Value: " + value);
    }
}
