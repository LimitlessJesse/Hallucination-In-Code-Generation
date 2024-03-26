import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_2 {
    public static void main(String[] args) {
        AtomicReference<String> atomicReference = new AtomicReference<>("Initial Value");
        System.out.println("Current Value: " + atomicReference.get());
    }
}
