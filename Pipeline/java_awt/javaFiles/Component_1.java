import java.awt.*;
import java.awt.event.*;

public class Component_1 extends Frame {
    public Main() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void addNotify() {
        super.addNotify();
        System.out.println("Component added to the screen.");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.setSize(300, 200);
        m.setVisible(true);
    }
}
