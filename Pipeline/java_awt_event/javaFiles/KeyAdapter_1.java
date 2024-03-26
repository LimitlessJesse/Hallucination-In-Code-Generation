import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapter_1 extends KeyAdapter {
    public static void main(String[] args) {
        // Create a new instance of Main
        Main main = new Main();

        // Simulate a key press
        main.keyPressed(new KeyEvent(null, 0, 0, 0, 'a', 'a'));
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // Print the key that was pressed
        System.out.println("Key pressed: " + e.getKeyChar());
    }
}
