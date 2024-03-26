import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatter;

public class DefaultFormatter_5 {
    public static void main(String[] args) {
        JFormattedTextField field = new JFormattedTextField();
        DefaultFormatter formatter = new DefaultFormatter();
        formatter.install(field);
    }
}
