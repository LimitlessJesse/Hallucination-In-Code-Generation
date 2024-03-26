import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor_5 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);

        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task executed by thread: " + Thread.currentThread().getName());
            }
        });

        executor.shutdown();
    }
}
