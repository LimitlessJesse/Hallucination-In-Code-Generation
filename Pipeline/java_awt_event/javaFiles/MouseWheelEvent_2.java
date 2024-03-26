import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseWheelEvent_2 {
    public static void main(String[] args) {
        MouseWheelEvent event = new MouseWheelEvent(null, 0, 0, 0, 1, false, false, false, false, 1);
        System.out.println(event.getUnitsToScroll());
    }
}
