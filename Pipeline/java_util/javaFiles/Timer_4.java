import java.util.Timer;
import java.util.TimerTask;

public class Timer_4 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed");
            }
        }, 0, 1000);
    }
}
