import java.util.Timer;
import java.util.TimerTask;

public class Timer_2 {
    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed");
            }
        };

        long delay = 1000; // 1 second
        timer.schedule(task, delay);
    }
}
