import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class CardLayout_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new CardLayout());

        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.add(new JButton("Button 1"));
        contentPane.add(panel1, "1");

        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        panel2.add(new JButton("Button 2"));
        contentPane.add(panel2, "2");

        CardLayout cardLayout = (CardLayout) contentPane.getLayout();
        cardLayout.next(contentPane);

        frame.setVisible(true);
    }
}
