import javax.swing.*;
import javax.swing.plaf.LayerUI;

public class LayerUI_2 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public void updateUI() {
                installUI(this);
            }
        };
        LayerUI layerUI = new LayerUI() {
            @Override
            public void installUI(JComponent c) {
                // Your implementation here
            }
        };
        layerUI.installUI(component);
    }
}
