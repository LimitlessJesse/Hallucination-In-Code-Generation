import javax.swing.*;
import javax.swing.plaf.InsetsUIResource;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class MetalBorders_TableHeaderBorder_5 {
    public static void main(String[] args) {
        JTable table = new JTable(5, 5);
        MetalBorders.TableHeaderBorder border = new MetalBorders.TableHeaderBorder();
        Insets insets = new InsetsUIResource();
        border.getBorderInsets(table, insets);
        System.out.println("Top: " + insets.top + ", Left: " + insets.left + ", Bottom: " + insets.bottom + ", Right: " + insets.right);
    }
}
