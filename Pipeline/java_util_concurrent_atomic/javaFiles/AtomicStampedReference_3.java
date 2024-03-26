import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_3 {
    public static void main(String[] args) {
        String reference = "Hello";
        int stamp = 1;
        AtomicStampedReference<String> atomicStampedReference = new AtomicStampedReference<>(reference, stamp);

        // Get the reference and stamp
        String[] refAndStamp = atomicStampedReference.getReference();
        System.out.println("Reference: " + refAndStamp[0]);
        System.out.println("Stamp: " + refAndStamp[1]);
    }
}
