import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdater_11 {
    private static class Test {
        public volatile long value;
    }

    public static void main(String[] args) {
        Test test = new Test();
        AtomicLongFieldUpdater<Test> updater = AtomicLongFieldUpdater.newUpdater(Test.class, "value");
        long newValue = updater.addAndGet(test, 10);
        System.out.println("New value: " + newValue);
    }
}
