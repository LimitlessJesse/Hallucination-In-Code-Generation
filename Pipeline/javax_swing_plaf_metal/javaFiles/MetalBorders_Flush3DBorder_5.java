import javax.swing.*;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.plaf.metal.MetalBorders.Flush3DBorder;
import java.awt.*;

public class MetalBorders_Flush3DBorder_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Button");
        Flush3DBorder border = new Flush3DBorder();
        Insets insets = new InsetsUIResource();
        border.getBorderInsets(button, insets);
        System.out.println("Top: " + insets.top + ", Left: " + insets.left + ", Bottom: " + insets.bottom + ", Right: " + insets.right);
    }
}
