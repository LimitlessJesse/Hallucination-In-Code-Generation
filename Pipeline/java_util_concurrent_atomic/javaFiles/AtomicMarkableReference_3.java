import java.util.concurrent.atomic.AtomicMarkableReference;

public class AtomicMarkableReference_3 {
    public static void main(String[] args) {
        AtomicMarkableReference<String> ref = new AtomicMarkableReference<>("Hello", false);
        System.out.println(ref.isMarked()); // Output: false

        ref.set("World", true);
        System.out.println(ref.isMarked()); // Output: true
    }
}
