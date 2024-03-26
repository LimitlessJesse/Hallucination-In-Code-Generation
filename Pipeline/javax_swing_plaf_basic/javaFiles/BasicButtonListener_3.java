import javax.swing.*;
import java.awt.event.MouseEvent;

public class BasicButtonListener_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JButton button = new JButton("Click me!");
        button.addMouseListener(new BasicButtonListener() {
            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Button clicked!");
            }
        });

        frame.getContentPane().add(button);
        frame.setVisible(true);
    }
}
