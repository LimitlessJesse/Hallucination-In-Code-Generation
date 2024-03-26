import javax.accessibility.AccessibleContext;
import javax.accessibility.AccessibleRole;
import javax.accessibility.AccessibleState;
import javax.accessibility.AccessibleValue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class AccessibleContext_2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JPanel panel = new JPanel();
            JButton button = new JButton("Button");
            panel.add(button);

            frame.getContentPane().add(panel);
            frame.pack();
            frame.setVisible(true);

            AccessibleContext context = button.getAccessibleContext();
            AccessibleContext childContext = (AccessibleContext) context.getAccessibleChild(0);

            System.out.println("Role: " + childContext.getAccessibleRole());
            System.out.println("State: " + childContext.getAccessibleStateSet());
            System.out.println("Value: " + childContext.getAccessibleValue());
        });
    }
}
