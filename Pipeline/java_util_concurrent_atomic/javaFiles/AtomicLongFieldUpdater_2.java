import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdater_2 {
    private static class Test {
        public volatile long value;
    }

    public static void main(String[] args) {
        Test test = new Test();
        AtomicLongFieldUpdater<Test> updater = AtomicLongFieldUpdater.newUpdater(Test.class, "value");

        long expect = 0;
        long update = 10;

        boolean result = updater.compareAndSet(test, expect, update);

        System.out.println("Result: " + result);
        System.out.println("Updated value: " + test.value);
    }
}
