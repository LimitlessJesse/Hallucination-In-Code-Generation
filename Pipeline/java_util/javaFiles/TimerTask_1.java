import java.util.Timer;
import java.util.TimerTask;

public class TimerTask_1 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed");
            }
        };
        timer.schedule(task, 1000);
        boolean canceled = task.cancel();
        System.out.println("Task canceled: " + canceled);
    }
}
