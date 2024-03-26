import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocal_1 {
    private static final ThreadLocal<AtomicInteger> counter = new ThreadLocal<>();

    public static void main(String[] args) {
        counter.set(new AtomicInteger(0));

        new Thread(() -> {
            counter.set(new AtomicInteger(10));
            System.out.println("Thread 1: " + counter.get());
        }).start();

        new Thread(() -> {
            counter.set(new AtomicInteger(20));
            System.out.println("Thread 2: " + counter.get());
        }).start();
    }
}
