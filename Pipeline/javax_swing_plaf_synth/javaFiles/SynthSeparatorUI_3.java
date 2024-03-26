import javax.swing.*;
import javax.swing.plaf.synth.*;

public class SynthSeparatorUI_3 {
    public static void main(String[] args) {
        JSeparator separator = new JSeparator();
        SynthSeparatorUI ui = new SynthSeparatorUI();
        System.out.println(ui.getPreferredSize(separator));
    }
}
