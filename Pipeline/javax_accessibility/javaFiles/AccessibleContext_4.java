import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleRole;
import javax.accessibility.AccessibleState;
import javax.accessibility.AccessibleValue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class AccessibleContext_4 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("AccessibleContext Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            JButton button = new JButton("Click me");
            JLabel label = new JLabel("Hello, World!");

            panel.add(button);
            panel.add(label);

            frame.getContentPane().add(panel);
            frame.pack();
            frame.setVisible(true);

            AccessibleContext buttonContext = button.getAccessibleContext();
            AccessibleContext labelContext = label.getAccessibleContext();

            AccessibleContext parentContext = buttonContext.getAccessibleParent();

            if (parentContext!= null) {
                System.out.println("Parent of the button is: " + parentContext.getAccessibleName());
            } else {
                System.out.println("No parent found for the button");
            }

            parentContext = labelContext.getAccessibleParent();

            if (parentContext!= null) {
                System.out.println("Parent of the label is: " + parentContext.getAccessibleName());
            } else {
                System.out.println("No parent found for the label");
            }
        });
    }
}
