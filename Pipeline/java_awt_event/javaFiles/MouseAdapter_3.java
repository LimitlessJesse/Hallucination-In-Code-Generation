import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapter_3 {
    public static void main(String[] args) {
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                System.out.println("Mouse released at position: (" + x + ", " + y + ")");
            }
        };
    }
}
