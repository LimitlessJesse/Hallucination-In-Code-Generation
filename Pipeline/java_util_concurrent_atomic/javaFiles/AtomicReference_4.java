import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_4 {
    public static void main(String[] args) {
        AtomicReference<String> atomicReference = new AtomicReference<>("Hello");
        String oldValue = "Hello";
        String newValue = "World";

        boolean result = atomicReference.compareAndSet(oldValue, newValue);

        System.out.println("Result: " + result);
        System.out.println("Updated Value: " + atomicReference.get());
    }
}
