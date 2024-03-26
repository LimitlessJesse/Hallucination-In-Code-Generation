import java.util.concurrent.atomic.AtomicLongArray;

public class AtomicLongArray_4 {
    public static void main(String[] args) {
        AtomicLongArray atomicLongArray = new AtomicLongArray(5);
        atomicLongArray.set(0, 100);
        atomicLongArray.set(1, 200);
        atomicLongArray.set(2, 300);
        atomicLongArray.set(3, 400);
        atomicLongArray.set(4, 500);

        for (int i = 0; i < atomicLongArray.length(); i++) {
            System.out.println("AtomicLongArray[" + i + "] = " + atomicLongArray.get(i));
        }
    }
}
