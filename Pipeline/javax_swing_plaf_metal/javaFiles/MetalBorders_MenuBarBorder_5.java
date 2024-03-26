import javax.swing.*;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class MetalBorders_MenuBarBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setUI(new MetalBorders.MenuBarBorderUI());

        Insets insets = new InsetsUIResource();
        menuBar.getUI().getBorderInsets(menuBar, insets);

        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
