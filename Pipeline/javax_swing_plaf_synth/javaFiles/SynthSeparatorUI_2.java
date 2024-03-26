import javax.swing.*;
import javax.swing.plaf.synth.SynthSeparatorUI;
import java.awt.*;

public class SynthSeparatorUI_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                SynthSeparatorUI ui = new SynthSeparatorUI();
                ui.paint(g, this);
            }
        };

        frame.add(panel);
        frame.setVisible(true);
    }
}
