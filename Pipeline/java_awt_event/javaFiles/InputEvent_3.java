import java.awt.event.InputEvent;

public class InputEvent_3 {
    public static void main(String[] args) {
        InputEvent event = new InputEvent();
        boolean isControlDown = event.isControlDown();
        System.out.println("Is control key down? " + isControlDown);
    }
}
