import java.awt.event.MouseWheelEvent;

public class MouseWheelEvent_3 {
    public static void main(String[] args) {
        MouseWheelEvent event = new MouseWheelEvent(null, 0, 0, 0, 0, 1, false, 1);
        int rotation = event.getWheelRotation();
        System.out.println("Wheel rotation: " + rotation);
    }
}
