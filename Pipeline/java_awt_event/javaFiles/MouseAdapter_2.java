import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapter_2 {
    public static void main(String[] args) {
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse button pressed at: " + e.getX() + ", " + e.getY());
            }
        };
    }
}
