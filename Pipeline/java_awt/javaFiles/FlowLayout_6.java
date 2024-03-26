import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayout_6 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        frame.add(button1);
        frame.add(button2);

        FlowLayout flowLayout = (FlowLayout) frame.getLayout();
        flowLayout.setVgap(10); // Set the vertical gap to 10

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
