import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor_1 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
        System.out.println("Core Pool Size: " + executor.getCorePoolSize());
    }
}
