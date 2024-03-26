import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.Component;
import java.awt.Insets;

public class BasicBorders_SplitPaneBorder_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);

        BasicBorders.SplitPaneBorder border = new BasicBorders.SplitPaneBorder();
        Insets insets = border.getBorderInsets(panel);

        System.out.println("Top: " + insets.top);
        System.out.println("Left: " + insets.left);
        System.out.println("Bottom: " + insets.bottom);
        System.out.println("Right: " + insets.right);
    }
}
