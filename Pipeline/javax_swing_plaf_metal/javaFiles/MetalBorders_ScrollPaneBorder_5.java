import javax.swing.*;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class MetalBorders_ScrollPaneBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBorder(new MetalBorders.ScrollPaneBorder());

        Insets insets = new InsetsUIResource();
        ((MetalBorders.ScrollPaneBorder) scrollPane.getBorder()).getBorderInsets(scrollPane, insets);

        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);

        frame.add(scrollPane);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
