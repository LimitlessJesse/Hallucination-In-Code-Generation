import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Timer_3 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task performed at: " + new Date());
            }
        }, new Date(System.currentTimeMillis() + 10000));
    }
}
