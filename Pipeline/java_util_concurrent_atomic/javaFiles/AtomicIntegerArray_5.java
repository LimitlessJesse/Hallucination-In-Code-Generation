import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArray_5 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(5);
        array.set(0, 10);
        int result = array.getAndDecrement(0);
        System.out.println("Result: " + result);
        System.out.println("Array: " + array);
    }
}
