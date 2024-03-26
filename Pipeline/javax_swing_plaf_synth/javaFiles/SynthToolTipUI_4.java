import javax.swing.*;
import javax.swing.plaf.synth.SynthToolTipUI;
import java.awt.*;

public class SynthToolTipUI_4 {
    public static void main(String[] args) {
        JComponent component = new JComponent() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(100, 100);
            }
        };

        SynthToolTipUI toolTipUI = new SynthToolTipUI() {
            @Override
            public Dimension getPreferredSize(JComponent c) {
                return super.getPreferredSize(c);
            }
        };

        Dimension preferredSize = toolTipUI.getPreferredSize(component);
        System.out.println("Preferred size: " + preferredSize);
    }
}
