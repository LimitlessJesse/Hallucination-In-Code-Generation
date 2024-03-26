import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArray_13 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(10);
        array.set(0, 10);
        array.set(1, 20);
        array.set(2, 30);

        int expect = 20;
        int update = 25;

        boolean result = array.weakCompareAndSet(1, expect, update);

        System.out.println("Result: " + result);
        System.out.println("Array: " + array);
    }
}
