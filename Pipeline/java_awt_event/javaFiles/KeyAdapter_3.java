import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapter_3 extends KeyAdapter {
    public static void main(String[] args) {
        // You can test the keyTyped method by creating a new instance of Main and adding it as a KeyListener to a component
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // This method is called when a key is typed.
        // You can get the key code and character typed with e.getKeyChar() and e.getKeyCode() respectively.
        System.out.println("Key typed: " + e.getKeyChar());
    }
}
