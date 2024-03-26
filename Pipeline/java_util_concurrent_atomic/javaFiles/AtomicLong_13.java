import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_13 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(0);

        atomicLong.updateAndGet(n -> n + 1);

        System.out.println(atomicLong.get());
    }
}
