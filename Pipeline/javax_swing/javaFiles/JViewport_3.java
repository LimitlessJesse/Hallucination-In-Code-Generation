import javax.swing.*;
import java.awt.*;

public class JViewport_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JViewport viewport = new JViewport();
        viewport.setViewPosition(new Point(100, 100));

        frame.getContentPane().add(viewport);
        frame.setVisible(true);
    }
}
