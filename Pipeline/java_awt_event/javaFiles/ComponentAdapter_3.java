import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ComponentAdapter_3 {
    public static void main(String[] args) {
        ComponentAdapter componentAdapter = new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                System.out.println("Component resized: " + e.getComponent().getSize());
            }
        };
    }
}
