import javax.swing.*;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.plaf.metal.MetalBorders.PaletteBorder;
import java.awt.*;

public class MetalBorders_PaletteBorder_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Button");
        PaletteBorder border = new PaletteBorder();
        Insets insets = new InsetsUIResource();
        border.getBorderInsets(button, insets);
        System.out.println("Top: " + insets.top + ", Left: " + insets.left + ", Bottom: " + insets.bottom + ", Right: " + insets.right);
    }
}
