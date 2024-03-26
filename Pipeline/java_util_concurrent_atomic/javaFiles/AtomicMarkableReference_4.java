import java.util.concurrent.atomic.AtomicMarkableReference;

public class AtomicMarkableReference_4 {
    public static void main(String[] args) {
        AtomicMarkableReference<String> ref = new AtomicMarkableReference<>("Hello", false);
        boolean result = ref.compareAndSet("Hello", "World", false, true);
        System.out.println(result);
        System.out.println(ref.getReference());
        System.out.println(ref.isMarked());
    }
}
