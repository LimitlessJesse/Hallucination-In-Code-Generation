import javax.swing.*;
import javax.swing.plaf.metal.MetalBorders.Flush3DBorder;
import java.awt.*;

public class MetalBorders_Flush3DBorder_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JButton button = new JButton("Button");
        button.setBounds(50, 50, 100, 30);
        button.setBorder(new Flush3DBorder());

        frame.getContentPane().add(button);
    }
}
