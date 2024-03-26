import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JLabel_5 {
    public static void main(String[] args) {
        JLabel label = new JLabel("Hello, World!");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        System.out.println(label.getText());
    }
}
