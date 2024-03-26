import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class JInternalFrame_16 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(200, 200);
        internalFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        internalFrame.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                System.out.println("Internal frame closed");
            }
        });

        frame.add(internalFrame);
        frame.setVisible(true);
    }
}
