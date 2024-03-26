import java.awt.event.KeyEvent;

public class KeyEvent_2 {
    public static void main(String[] args) {
        int keyCode = KeyEvent.VK_A; // for example, we are using 'A' key
        int keyLocation = KeyEvent.getKeyLocation(keyCode);
        System.out.println("The location of the key is: " + keyLocation);
    }
}
