import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardLayout_5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Card Layout Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new CardLayout());

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(new JButton("Button 1"));

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(new JButton("Button 2"));

        contentPane.add(panel1, "1");
        contentPane.add(panel2, "2");

        CardLayout cardLayout = (CardLayout) contentPane.getLayout();
        cardLayout.next(contentPane);
        cardLayout.previous(contentPane);

        frame.setVisible(true);
    }
}
