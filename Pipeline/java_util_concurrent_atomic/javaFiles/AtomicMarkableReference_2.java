import java.util.concurrent.atomic.AtomicMarkableReference;

public class AtomicMarkableReference_2 {
    public static void main(String[] args) {
        String reference = "Hello";
        AtomicMarkableReference<String> atomicMarkableReference = new AtomicMarkableReference<>(reference, false);
        System.out.println(atomicMarkableReference.getReference());
    }
}
