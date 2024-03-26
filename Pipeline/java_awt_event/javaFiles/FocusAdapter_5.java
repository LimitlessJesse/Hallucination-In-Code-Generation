import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FocusAdapter_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Focus Event Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField(20);
        textField.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("Focus gained");
            }
        });

        frame.add(textField);
        frame.setVisible(true);
    }
}
