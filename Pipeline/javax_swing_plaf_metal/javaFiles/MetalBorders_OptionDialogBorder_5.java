import javax.swing.*;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class MetalBorders_OptionDialogBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Button");
        frame.getContentPane().add(button);

        MetalBorders.OptionDialogBorder border = new MetalBorders.OptionDialogBorder();
        Insets insets = new InsetsUIResource();
        border.getBorderInsets(button, insets);

        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);

        frame.setVisible(true);
    }
}
