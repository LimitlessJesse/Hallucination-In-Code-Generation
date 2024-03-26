import java.awt.event.InputEvent;

public class InputEvent_2 {
    public static void main(String[] args) {
        InputEvent event = new InputEvent();
        boolean isAltDown = event.isAltDown();
        System.out.println("Is ALT key down? " + isAltDown);
    }
}
