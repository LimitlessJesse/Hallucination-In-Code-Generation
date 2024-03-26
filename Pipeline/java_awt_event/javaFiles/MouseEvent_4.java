import java.awt.event.MouseEvent;

public class MouseEvent_4 {
    public static void main(String[] args) {
        MouseEvent event = new MouseEvent(null, 0, 0, 0, 0, MouseEvent.BUTTON1, false);
        int button = event.getButton();
        System.out.println("Button pressed: " + button);
    }
}
