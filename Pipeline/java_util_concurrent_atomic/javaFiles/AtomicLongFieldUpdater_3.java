import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdater_3 {
    private static class Test {
        volatile long value;
    }

    public static void main(String[] args) {
        AtomicLongFieldUpdater<Test> updater = AtomicLongFieldUpdater.newUpdater(Test.class, "value");
        Test test = new Test();
        updater.set(test, 10);
        System.out.println(updater.get(test));  // Output: 10
    }
}
