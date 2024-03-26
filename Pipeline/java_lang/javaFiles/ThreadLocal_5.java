import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocal_5 {
    private static final ThreadLocal<AtomicInteger> counter = ThreadLocal.withInitial(() -> new AtomicInteger(0));

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + counter.get().incrementAndGet());
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + counter.get().incrementAndGet());
            }
        }).start();
    }
}
