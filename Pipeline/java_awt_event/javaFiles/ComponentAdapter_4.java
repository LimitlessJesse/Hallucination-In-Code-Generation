import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class ComponentAdapter_4 {
    public static void main(String[] args) {
        ComponentAdapter componentAdapter = new ComponentAdapter() {
            @Override
            public void componentShown(ComponentEvent e) {
                System.out.println("Component is shown");
            }
        };

        // You can use this componentAdapter in your code
    }
}
