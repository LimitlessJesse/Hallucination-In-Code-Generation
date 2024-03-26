import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_5 {
    public static void main(String[] args) {
        AtomicStampedReference<String> atomicStampedRef = new AtomicStampedReference<>("Hello", 0);
        atomicStampedRef.set("World", 1);
        System.out.println("Reference: " + atomicStampedRef.getReference());
        System.out.println("Stamp: " + atomicStampedRef.getStamp());
    }
}
