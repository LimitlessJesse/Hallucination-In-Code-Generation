import javax.swing.*;
import java.awt.event.MouseEvent;

public class BasicButtonListener_5 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        button.addMouseListener(new BasicButtonListener() {
            @Override
            public void mouseExited(MouseEvent e) {
                // This method is called when the mouse exits the button
                System.out.println("Mouse exited the button");
            }
        });
    }
}
