import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArray_12 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(5);
        array.set(0, 10);
        array.set(1, 20);
        array.set(2, 30);
        array.set(3, 40);
        array.set(4, 50);

        int newValue = array.addAndGet(0, 10);
        System.out.println("New value at index 0: " + newValue);
        System.out.println("Array: " + array);
    }
}
