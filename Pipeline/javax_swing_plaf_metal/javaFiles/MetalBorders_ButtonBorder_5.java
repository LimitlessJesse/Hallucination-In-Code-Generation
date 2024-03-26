import javax.swing.*;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class MetalBorders_ButtonBorder_5 {
    public static void main(String[] args) {
        JButton button = new JButton("Button");
        MetalBorders.ButtonBorder border = new MetalBorders.ButtonBorder();
        Insets insets = new InsetsUIResource();
        border.getBorderInsets(button, insets);
        System.out.println("Top: " + insets.top + ", Left: " + insets.left + ", Bottom: " + insets.bottom + ", Right: " + insets.right);
    }
}
