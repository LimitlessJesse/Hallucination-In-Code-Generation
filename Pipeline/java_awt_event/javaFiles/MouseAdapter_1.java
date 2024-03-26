import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseAdapter_1 {
    public static void main(String[] args) {
        MouseAdapter mouseAdapter = new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse clicked!");
            }
        };
    }
}
