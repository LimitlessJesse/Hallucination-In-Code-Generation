import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import java.awt.Point;

public class JViewport_29 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JScrollPane scrollPane = new JScrollPane();
        JViewport viewport = scrollPane.getViewport();

        Point viewPosition = viewport.getViewPosition();

        System.out.println("View Position: (" + viewPosition.x + ", " + viewPosition.y + ")");
    }
}
