import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_2 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(10);
        long currentValue = atomicLong.get();
        System.out.println("Current value: " + currentValue);
    }
}
