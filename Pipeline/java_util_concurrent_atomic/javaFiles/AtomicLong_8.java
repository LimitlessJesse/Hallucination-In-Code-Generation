import java.util.concurrent.atomic.AtomicLong;

public class AtomicLong_8 {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong();
        atomicLong.lazySet(10);
        System.out.println(atomicLong.get());
    }
}
