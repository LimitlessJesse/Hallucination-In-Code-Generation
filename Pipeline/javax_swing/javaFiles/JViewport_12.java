import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import java.awt.Rectangle;

public class JViewport_12 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JScrollPane scrollPane = new JScrollPane();
        JViewport viewport = scrollPane.getViewport();

        Rectangle viewRect = viewport.getViewRect();

        System.out.println("View Rectangle: " + viewRect);
    }
}
