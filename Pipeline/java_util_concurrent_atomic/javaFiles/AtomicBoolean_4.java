import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBoolean_4 {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        System.out.println("Initial value: " + atomicBoolean.get());

        atomicBoolean.set(true);
        System.out.println("Updated value: " + atomicBoolean.get());
    }
}
