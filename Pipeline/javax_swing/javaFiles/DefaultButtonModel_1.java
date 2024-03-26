import javax.swing.JButton;
import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_1 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        DefaultButtonModel model = (DefaultButtonModel) button.getModel();

        // Simulate a rollover event
        model.setRollover(true);
        System.out.println("Button is rolled over: " + model.isRollover());

        // Simulate a rollout event
        model.setRollover(false);
        System.out.println("Button is rolled over: " + model.isRollover());
    }
}
