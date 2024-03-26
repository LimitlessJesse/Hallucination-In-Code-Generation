import java.util.concurrent.atomic.AtomicIntegerArray;

public class AtomicIntegerArray_9 {
    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(5);
        array.lazySet(0, 10);
        array.lazySet(1, 20);
        array.lazySet(2, 30);
        array.lazySet(3, 40);
        array.lazySet(4, 50);

        for (int i = 0; i < array.length(); i++) {
            System.out.println("Element at index " + i + ": " + array.get(i));
        }
    }
}
