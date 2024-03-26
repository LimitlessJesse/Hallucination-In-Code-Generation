import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_2 {
    public static void main(String[] args) {
        AtomicStampedReference<String> atomicStampedRef = new AtomicStampedReference<>("Hello", 0);
        String expectedReference = "Hello";
        String newReference = "World";
        int expectedStamp = 0;
        int newStamp = 1;

        boolean result = atomicStampedRef.compareAndSet(expectedReference, newReference, expectedStamp, newStamp);

        System.out.println("Result: " + result);
        System.out.println("Current Value: " + atomicStampedRef.getReference());
        System.out.println("Current Stamp: " + atomicStampedRef.getStamp());
    }
}
