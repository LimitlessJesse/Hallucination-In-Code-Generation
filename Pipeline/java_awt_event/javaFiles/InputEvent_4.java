import java.awt.event.InputEvent;

public class InputEvent_4 {
    public static void main(String[] args) {
        InputEvent event = new InputEvent() {
            @Override
            public boolean isShiftDown() {
                // Implement the logic to check if the shift key is pressed
                // For example, return true if the shift key is pressed
                return true;
            }
        };

        boolean shiftDown = event.isShiftDown();
        System.out.println("Is shift key down? " + shiftDown);
    }
}
