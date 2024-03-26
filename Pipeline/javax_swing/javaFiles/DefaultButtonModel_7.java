import javax.swing.JButton;
import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_7 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        ButtonModel model = button.getModel();
        DefaultButtonModel defaultModel = (DefaultButtonModel) model;

        // Set the button as selected
        defaultModel.setSelected(true);

        // Check if the button is selected
        boolean isSelected = defaultModel.isSelected();
        System.out.println("Is the button selected? " + isSelected);
    }
}
