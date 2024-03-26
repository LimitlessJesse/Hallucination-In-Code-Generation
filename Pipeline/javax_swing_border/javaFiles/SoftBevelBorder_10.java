import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
import java.awt.*;

public class SoftBevelBorder_10 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBorder(new SoftBevelBorder(SoftBevelBorder.RAISED));

        panel.paintBorder(panel, panel.getGraphics(), 0, 0, panel.getWidth(), panel.getHeight());

        frame.add(panel);
        frame.setVisible(true);
    }
}
