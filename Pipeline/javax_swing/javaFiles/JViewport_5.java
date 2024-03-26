import javax.swing.*;
import java.awt.*;

public class JViewport_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);

        JViewport viewport = new JViewport();
        viewport.setViewSize(new Dimension(200, 200));

        frame.getContentPane().add(viewport);
        frame.setVisible(true);
    }
}
