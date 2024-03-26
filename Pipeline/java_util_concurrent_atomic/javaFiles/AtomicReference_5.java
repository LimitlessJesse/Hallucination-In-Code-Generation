import java.util.concurrent.atomic.AtomicReference;

public class AtomicReference_5 {
    public static void main(String[] args) {
        AtomicReference<String> atomicReference = new AtomicReference<>();
        atomicReference.lazySet("Hello");
        System.out.println(atomicReference.get());
    }
}
