import java.awt.event.MouseEvent;

public class MouseEvent_3 {
    public static void main(String[] args) {
        MouseEvent event = new MouseEvent(null, 0, 0, 0, 0, 0, 0, false, 0);
        int clickCount = event.getClickCount();
        System.out.println("Number of times the mouse button has been clicked: " + clickCount);
    }
}
