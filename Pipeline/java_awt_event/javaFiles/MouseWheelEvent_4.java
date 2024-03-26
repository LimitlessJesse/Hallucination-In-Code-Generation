import java.awt.event.MouseWheelEvent;

public class MouseWheelEvent_4 {
    public static void main(String[] args) {
        MouseWheelEvent event = new MouseWheelEvent(null, 0, 0, 0, 1, false, false, false, false, 1);
        int scrollAmount = event.getScrollAmount();
        System.out.println("Scroll Amount: " + scrollAmount);
    }
}
