import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutor_2 {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 10, 1000, TimeUnit.MILLISECONDS, null);
        System.out.println("Maximum Pool Size: " + executor.getMaximumPoolSize());
    }
}
