import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.border.AbstractBorder;
import java.awt.Insets;
import java.awt.Component;

public class AbstractBorder_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Button");
        button.setBorder(new AbstractBorder() {
            @Override
            public Insets getBorderInsets(Component c) {
                return new Insets(10, 10, 10, 10);
            }
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
