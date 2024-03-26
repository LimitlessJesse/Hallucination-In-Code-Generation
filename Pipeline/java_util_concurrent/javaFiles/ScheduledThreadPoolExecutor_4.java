import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutor_4 {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(1);

        Runnable task = new Runnable() {
            public void run() {
                System.out.println("Task executed");
            }
        };

        executor.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);
    }
}
