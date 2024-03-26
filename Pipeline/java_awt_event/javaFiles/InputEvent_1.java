import java.awt.event.InputEvent;

public class InputEvent_1 {
    public static void main(String[] args) {
        InputEvent event = new InputEvent();
        boolean isMetaDown = event.isMetaDown();
        System.out.println("Is Meta key down? " + isMetaDown);
    }
}
