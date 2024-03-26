import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthTableHeaderUI_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        SynthUI ui = new SynthUI();
        SynthTableHeaderUI headerUI = new SynthTableHeaderUI();

        headerUI.update(frame.getGraphics(), frame);

        frame.setVisible(true);
    }
}
