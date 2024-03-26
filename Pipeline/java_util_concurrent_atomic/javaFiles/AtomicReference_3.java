import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_3 {
    public static void main(String[] args) {
        AtomicReference<String> atomicReference = new AtomicReference<>("Initial Value");

        String newValue = "New Value";
        String oldValue = atomicReference.getAndSet(newValue);

        System.out.println("Old Value: " + oldValue);
        System.out.println("New Value: " + atomicReference.get());
    }
}
