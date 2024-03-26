import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ComponentAdapter_2 {
    public static void main(String[] args) {
        ComponentAdapter componentAdapter = new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                System.out.println("Component moved to: " + e.getComponent().getLocation());
            }
        };
    }
}
