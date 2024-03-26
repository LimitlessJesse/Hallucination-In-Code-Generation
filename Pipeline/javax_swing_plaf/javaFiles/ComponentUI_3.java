import javax.swing.*;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicButtonUI;

public class ComponentUI_3 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        ComponentUI ui = new BasicButtonUI();
        ui.installUI(button);
    }
}
