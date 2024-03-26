import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor_4 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            executor.execute(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
        System.out.println("Active Threads: " + executor.getActiveCount());
        executor.shutdown();
    }
}
