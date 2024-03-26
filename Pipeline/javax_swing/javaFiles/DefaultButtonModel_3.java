import javax.swing.JButton;
import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_3 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        DefaultButtonModel model = (DefaultButtonModel) button.getModel();

        // Simulate a button press
        model.setPressed(true);

        // Check if the button is pressed
        boolean isPressed = model.isPressed();

        System.out.println("Button is pressed: " + isPressed);
    }
}
