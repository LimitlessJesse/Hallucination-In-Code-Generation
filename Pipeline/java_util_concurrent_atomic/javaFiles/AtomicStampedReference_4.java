import java.util.concurrent.atomic.AtomicStampedReference;

public class AtomicStampedReference_4 {
    public static void main(String[] args) {
        AtomicStampedReference<String> ref = new AtomicStampedReference<>("Hello", 1);
        int stamp = ref.getStamp();
        System.out.println("Stamp: " + stamp);
    }
}
