import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JFrame;

public class ComponentAdapter_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentHidden(ComponentEvent e) {
                System.out.println("Component is hidden.");
            }
        });
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
