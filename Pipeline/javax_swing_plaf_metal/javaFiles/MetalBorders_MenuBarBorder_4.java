import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class MetalBorders_MenuBarBorder_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        MetalBorders.MenuBarBorder border = new MetalBorders.MenuBarBorder();
        border.paintBorder(frame, frame.getGraphics(), 0, 0, frame.getWidth(), frame.getHeight());
    }
}
