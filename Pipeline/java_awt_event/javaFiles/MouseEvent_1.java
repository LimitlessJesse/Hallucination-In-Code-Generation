import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseEvent Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Click and Drag");
        frame.add(label);

        frame.addMouseMotionListener(new MouseAdapter() {
            public void mouseDragged(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                label.setText("Mouse pointer is at: (" + x + ", " + y + ")");
            }
        });

        frame.setVisible(true);
    }
}
