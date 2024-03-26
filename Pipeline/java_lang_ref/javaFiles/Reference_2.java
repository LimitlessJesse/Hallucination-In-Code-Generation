import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

public class Reference_2 {
    public static void main(String[] args) {
        ReferenceQueue<Object> queue = new ReferenceQueue<>();
        Reference<Object> ref = new Reference<>(new Object(), queue);
        queue.add(ref);
        System.out.println("Before clear: " + queue);
        queue.clear();
        System.out.println("After clear: " + queue);
    }
}
