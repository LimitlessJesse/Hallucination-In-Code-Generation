import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArray_8 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(5);
        array.set(0, 10);
        array.set(1, 20);
        array.set(2, 30);
        array.set(3, 40);
        array.set(4, 50);

        int expect = 20;
        int update = 200;

        boolean result = array.compareAndSet(1, expect, update);

        System.out.println("Result: " + result);
        System.out.println("Array: " + array);
    }
}
