import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthToolTipUI_5 {
    public static void main(String[] args) {
        JToolTip toolTip = new JToolTip();
        SynthToolTipUI synthToolTipUI = new SynthToolTipUI();
        synthToolTipUI.update(toolTip.getGraphics(), toolTip);
    }
}
