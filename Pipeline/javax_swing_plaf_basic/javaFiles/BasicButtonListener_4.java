import javax.swing.*;
import java.awt.event.MouseEvent;
import javax.swing.plaf.basic.BasicButtonListener;

public class BasicButtonListener_4 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        button.addMouseListener(new BasicButtonListener() {
            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entered the button");
            }
        });
    }
}
