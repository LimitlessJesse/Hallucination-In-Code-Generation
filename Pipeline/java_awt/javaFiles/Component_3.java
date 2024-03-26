import java.awt.Component;
import java.awt.Graphics;

public class Component_3 {
    public static void main(String[] args) {
        Component component = new Component() {
            @Override
            public void paint(Graphics g) {
                g.drawString("Hello, World!", 10, 20);
            }
        };

        component.repaint();
    }
}
