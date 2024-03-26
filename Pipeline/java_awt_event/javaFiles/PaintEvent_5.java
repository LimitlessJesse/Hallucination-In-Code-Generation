import java.awt.Rectangle;
import java.awt.event.PaintEvent;

public class PaintEvent_5 {
    public static void main(String[] args) {
        PaintEvent event = new PaintEvent(null, 0, 0, 0, 0, false);
        Rectangle updateRect = event.getUpdateRect();
        System.out.println("Update Rectangle: " + updateRect);
    }
}
