import javax.swing.*;
import javax.swing.border.TitledBorder;

public class TitledBorder_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Titled Border Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        TitledBorder border = BorderFactory.createTitledBorder("Title");
        border.setTitlePosition(TitledBorder.LEFT);
        panel.setBorder(border);

        JLabel label = new JLabel("Hello, World!");
        panel.add(label);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
