import javax.swing.*;
import java.awt.*;

public class JViewport_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JViewport Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(200, 200));

        JViewport viewport = new JViewport();
        viewport.setView(panel);

        frame.getContentPane().add(viewport);
        frame.pack();
        frame.setVisible(true);
    }
}
