import javax.swing.JFormattedTextField;
import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;

public class JFormattedTextField_4 {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        JFormattedTextField field = new JFormattedTextField(formatter);

        // Set the value of the field
        field.setValue(10);

        // Print the value of the field
        System.out.println(field.getValue());
    }
}
