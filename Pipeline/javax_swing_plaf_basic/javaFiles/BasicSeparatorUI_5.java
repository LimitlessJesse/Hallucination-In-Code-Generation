import javax.swing.*;
import javax.swing.plaf.basic.BasicSeparatorUI;

public class BasicSeparatorUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public void updateUI() {
                setUI(new BasicSeparatorUI());
                super.updateUI();
            }
        };
        component.updateUI();
        BasicSeparatorUI ui = (BasicSeparatorUI) component.getUI();
        ui.installUI(component);
    }
}
