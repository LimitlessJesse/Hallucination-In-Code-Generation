import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class MetalBorders_TableHeaderBorder_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JTable table = new JTable(5, 5);
        table.setBorder(new MetalBorders.TableHeaderBorder());

        frame.add(table);
    }
}
