import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyAdapter_2 {
    public static void main(String[] args) {
        KeyAdapter keyAdapter = new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Key released: " + e.getKeyCode());
            }
        };
    }
}
