import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_11 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        long delta = 5;
        long oldValue = atomicLong.getAndAdd(delta);
        System.out.println("Old value: " + oldValue);
        System.out.println("New value: " + atomicLong.get());
    }
}
