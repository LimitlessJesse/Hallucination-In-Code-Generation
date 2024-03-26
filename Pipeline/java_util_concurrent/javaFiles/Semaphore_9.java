import java.util.concurrent.Semaphore;

public class Semaphore_9 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        boolean result = semaphore.tryAcquire(1);
        System.out.println(result);
    }
}
