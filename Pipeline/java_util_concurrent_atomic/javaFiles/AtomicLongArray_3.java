import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_3 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(5);
        atomicLongArray.set(0, 10);
        atomicLongArray.set(1, 20);
        atomicLongArray.set(2, 30);
        atomicLongArray.set(3, 40);
        atomicLongArray.set(4, 50);

        long value = atomicLongArray.get(2);
        System.out.println("Value at index 2: " + value);
    }
}
