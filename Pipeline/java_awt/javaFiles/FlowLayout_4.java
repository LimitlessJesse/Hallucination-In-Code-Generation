import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JButton;

public class FlowLayout_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FlowLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a FlowLayout with alignment to the right
        FlowLayout flowLayout = new FlowLayout(FlowLayout.RIGHT);
        frame.setLayout(flowLayout);

        // Add three buttons to the frame
        for (int i = 1; i <= 3; i++) {
            frame.add(new JButton("Button " + i));
        }

        frame.pack();
        frame.setVisible(true);
    }
}
