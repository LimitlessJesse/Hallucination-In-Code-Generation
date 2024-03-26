import java.awt.event.MouseEvent;

public class MouseEvent_2 {
    public static void main(String[] args) {
        MouseEvent event = new MouseEvent(null, 0, 0, 0, 100, 200, 1, false);
        int y = event.getY();
        System.out.println("Y coordinate: " + y);
    }
}
