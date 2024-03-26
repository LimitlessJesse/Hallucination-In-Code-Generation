import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class JInternalFrame_8 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        frame.add(internalFrame);
        internalFrame.setVisible(true);
        frame.setVisible(true);
        internalFrame.toFront();
    }
}
