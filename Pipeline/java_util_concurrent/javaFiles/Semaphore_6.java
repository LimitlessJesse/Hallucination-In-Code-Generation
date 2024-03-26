import java.util.concurrent.Semaphore;

public class Semaphore_6 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);
        System.out.println("Available permits: " + semaphore.availablePermits());
    }
}
