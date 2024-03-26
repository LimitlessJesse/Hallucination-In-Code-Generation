import javax.swing.*;

public class InputVerifier_2 {
    public static void main(String[] args) {
        JTextField textField = new JTextField();
        textField.setInputVerifier(new InputVerifier() {
            @Override
            public boolean shouldYieldFocus(JComponent input) {
                JTextField textField = (JTextField) input;
                String text = textField.getText();
                if (text.isEmpty()) {
                    return false;
                }
                return true;
            }
        });
    }
}
