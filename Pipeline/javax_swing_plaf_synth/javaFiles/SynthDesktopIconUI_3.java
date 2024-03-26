import javax.swing.*;
import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.awt.*;

public class SynthDesktopIconUI_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SynthDesktopIconUI ui = new SynthDesktopIconUI();
        ui.paint(frame.getGraphics(), frame);

        frame.setVisible(true);
    }
}
