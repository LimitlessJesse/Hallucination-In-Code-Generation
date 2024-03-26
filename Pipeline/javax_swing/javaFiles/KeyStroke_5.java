import javax.swing.KeyStroke;

public class KeyStroke_5 {
    public static void main(String[] args) {
        KeyStroke keyStroke = KeyStroke.getKeyStroke(KeyStroke.VK_A, KeyStroke.CTRL_DOWN_MASK, true);
        System.out.println(keyStroke);
    }
}
