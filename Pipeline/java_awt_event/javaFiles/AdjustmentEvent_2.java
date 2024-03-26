import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class AdjustmentEvent_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Adjustment Event Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JScrollBar scrollBar = new JScrollBar(JScrollBar.HORIZONTAL);
        scrollBar.setPreferredSize(new java.awt.Dimension(100, 16));
        scrollBar.setMaximum(100);
        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int value = e.getValue();
                System.out.println("Current value: " + value);
            }
        });

        frame.getContentPane().add(scrollBar);
        frame.setVisible(true);
    }
}
