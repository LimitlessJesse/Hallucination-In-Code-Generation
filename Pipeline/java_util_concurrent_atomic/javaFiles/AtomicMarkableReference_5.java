import java.util.concurrent.atomic.AtomicMarkableReference;

public class AtomicMarkableReference_5 {
    public static void main(String[] args) {
        AtomicMarkableReference<String> ref = new AtomicMarkableReference<>("Hello", false);
        ref.set("World", true);
        System.out.println("Reference: " + ref.getReference() + ", Mark: " + ref.isMarked());
    }
}
