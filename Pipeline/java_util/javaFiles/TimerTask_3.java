import java.util.Timer;
import java.util.TimerTask;

public class TimerTask_3 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed at: " + scheduledExecutionTime());
            }
        };
        timer.schedule(task, 1000);
    }
}
