import java.util.concurrent.Semaphore;

public class Semaphore_7 {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(1);

        // Attempt to acquire the semaphore
        boolean acquired = semaphore.tryAcquire();

        if (acquired) {
            System.out.println("Semaphore acquired");

            // Release the semaphore
            semaphore.release();
        } else {
            System.out.println("Semaphore not acquired");
        }
    }
}
