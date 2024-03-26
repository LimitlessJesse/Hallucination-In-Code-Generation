import javax.swing.*;
import java.awt.*;

public class InputVerifier_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Input Verifier Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(10);
        textField.setInputVerifier(new InputVerifier() {
            @Override
            public boolean verify(JComponent input) {
                String text = ((JTextField) input).getText();
                try {
                    Integer.parseInt(text);
                    return true;
                } catch (NumberFormatException e) {
                    return false;
                }
            }
        });

        frame.add(textField);
        frame.setVisible(true);
    }
}
