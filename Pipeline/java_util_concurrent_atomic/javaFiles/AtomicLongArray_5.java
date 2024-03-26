import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_5 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(5);
        atomicLongArray.set(0, 10);
        atomicLongArray.set(1, 20);
        atomicLongArray.set(2, 30);
        atomicLongArray.set(3, 40);
        atomicLongArray.set(4, 50);

        long oldValue = atomicLongArray.getAndSet(2, 100);
        System.out.println("Old value at index 2: " + oldValue);
        System.out.println("New value at index 2: " + atomicLongArray.get(2));
    }
}
