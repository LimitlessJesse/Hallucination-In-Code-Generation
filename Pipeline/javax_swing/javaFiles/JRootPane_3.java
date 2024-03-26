import javax.swing.JFrame;
import javax.swing.JRootPane;

public class JRootPane_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JRootPane rootPane = frame.getRootPane();
        rootPane.setWindowDecorationStyle(JRootPane.FRAME);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
