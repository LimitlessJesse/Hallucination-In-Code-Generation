import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders;
import java.awt.*;

public class MetalBorders_MenuItemBorder_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton button = new JButton("Button");
        button.setBorder(new MetalBorders.MenuItemBorder());
        frame.add(button);
    }
}
