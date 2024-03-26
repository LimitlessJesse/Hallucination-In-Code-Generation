import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class JPasswordField_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Password Field Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(50, 50, 150, 30);
        frame.add(passwordField);

        frame.setLayout(null);
        frame.setVisible(true);

        char[] password = passwordField.getPassword();
        String passwordString = new String(password);

        JOptionPane.showMessageDialog(frame, "Entered Password: " + passwordString);
    }
}
