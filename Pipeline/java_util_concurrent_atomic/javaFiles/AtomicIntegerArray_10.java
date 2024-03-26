import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArray_10 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(5);
        int newValue = array.incrementAndGet(0);
        System.out.println("New value: " + newValue);
    }
}
