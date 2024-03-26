import javax.swing.JViewport;
import javax.swing.JScrollPane;
import javax.swing.JPanel;

public class JViewport_2 {
    public static void main(String[] args) {
        JViewport viewport = new JViewport();
        JScrollPane scrollPane = new JScrollPane(viewport);
        JPanel panel = new JPanel();
        viewport.setView(panel);
        System.out.println(viewport.getView());
    }
}
