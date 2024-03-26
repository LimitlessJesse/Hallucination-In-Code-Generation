import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseWheelEvent_1 {
    public static void main(String[] args) {
        MouseWheelEvent event = new MouseWheelEvent(null, 0, 0, 0, 0, 0, 0, false, MouseWheelEvent.WHEEL_UNIT_SCROLL);
        System.out.println(event.getScrollType());
    }
}
