import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Timer_2 {
    public static void main(String[] args) {
        Timer timer = new Timer(1000, new ActionListener() {
            int count = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Count: " + count++);
                if (count > 5) {
                    ((Timer)e.getSource()).stop();
                }
            }
        });

        timer.start();
    }
}
