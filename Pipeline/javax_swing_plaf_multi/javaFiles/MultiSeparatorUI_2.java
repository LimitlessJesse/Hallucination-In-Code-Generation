import javax.swing.*;
import javax.swing.plaf.multi.MultiSeparatorUI;

public class MultiSeparatorUI_2 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public MultiSeparatorUI getUI() {
                return new MultiSeparatorUI() {
                    @Override
                    public void installUI(JComponent c) {
                        super.installUI(c);
                        // Your custom UI installation code here
                    }
                };
            }
        };

        component.getUI().installUI(component);
    }
}
