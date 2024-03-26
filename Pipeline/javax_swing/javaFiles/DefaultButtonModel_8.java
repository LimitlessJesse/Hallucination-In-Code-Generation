import javax.swing.JButton;
import javax.swing.DefaultButtonModel;

public class DefaultButtonModel_8 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        DefaultButtonModel model = (DefaultButtonModel) button.getModel();
        model.setSelected(true);
    }
}
