import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArray_11 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(10);
        array.set(0, 10);
        int newValue = array.decrementAndGet(0);
        System.out.println("New value: " + newValue);
    }
}
