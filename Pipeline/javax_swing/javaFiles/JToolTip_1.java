import javax.swing.JToolTip;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JToolTip_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel("Hello");
        JToolTip toolTip = new JToolTip();

        toolTip.setTipText("This is a tool tip");
        label.setToolTip(toolTip);

        frame.add(label);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
