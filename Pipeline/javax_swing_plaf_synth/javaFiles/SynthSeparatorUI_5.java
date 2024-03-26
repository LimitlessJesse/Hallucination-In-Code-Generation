import javax.swing.*;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class SynthSeparatorUI_5 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public void updateUI() {
                setUI(new SynthSeparatorUI());
                super.updateUI();
            }
        };
        SynthSeparatorUI ui = new SynthSeparatorUI();
        ui.installUI(component);
    }
}
