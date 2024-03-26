import javax.swing.*;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class MetalBorders_MenuItemBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Button");
        frame.getContentPane().add(button);
        frame.setSize(300, 200);
        frame.setVisible(true);

        MetalBorders.MenuItemBorder border = new MetalBorders.MenuItemBorder();
        Insets insets = new InsetsUIResource();
        border.getBorderInsets(button, insets);

        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);
    }
}
