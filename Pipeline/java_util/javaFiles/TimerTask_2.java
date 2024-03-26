import java.util.Timer;
import java.util.TimerTask;

public class TimerTask_2 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task performed at: " + System.currentTimeMillis());
            }
        }, 0, 1000); // execute every second
    }
}
