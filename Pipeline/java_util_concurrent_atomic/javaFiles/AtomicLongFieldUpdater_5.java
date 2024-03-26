import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdater_5 {
    private volatile long value;
    private static final AtomicLongFieldUpdater<Main> updater =
            AtomicLongFieldUpdater.newUpdater(Main.class, "value");

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(updater.getAndSet(main, 10)); // prints 0
        System.out.println(main.value); // prints 10
    }
}
