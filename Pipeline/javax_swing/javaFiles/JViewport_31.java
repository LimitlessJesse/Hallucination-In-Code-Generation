import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JViewport;
import java.awt.Dimension;

public class JViewport_31 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JScrollPane scrollPane = new JScrollPane();
        JViewport viewport = scrollPane.getViewport();

        Dimension viewSize = viewport.getViewSize();

        System.out.println("View Width: " + viewSize.getWidth());
        System.out.println("View Height: " + viewSize.getHeight());
    }
}
