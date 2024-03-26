import javax.swing.*;
import javax.swing.plaf.synth.SynthSpinnerUI;
import java.awt.*;

public class SynthSpinnerUI_3 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        SynthSpinnerUI ui = new SynthSpinnerUI();
        ui.paint(spinner.getGraphics(), spinner);
    }
}
