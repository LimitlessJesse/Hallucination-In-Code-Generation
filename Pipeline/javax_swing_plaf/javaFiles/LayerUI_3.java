import javax.swing.*;
import javax.swing.plaf.LayerUI;

public class LayerUI_3 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public void updateUI() {
                super.updateUI();
                LayerUI<JComponent> layerUI = new LayerUI<>() {
                    @Override
                    public void uninstallUI(JComponent c) {
                        super.uninstallUI(c);
                        // Your code here
                    }
                };
                setUI(layerUI);
            }
        };
        component.updateUI();
    }
}
