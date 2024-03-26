import java.util.Timer;
import java.util.TimerTask;

public class Timer_5 {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task executed");
            }
        }, 0, 1000);
    }
}
