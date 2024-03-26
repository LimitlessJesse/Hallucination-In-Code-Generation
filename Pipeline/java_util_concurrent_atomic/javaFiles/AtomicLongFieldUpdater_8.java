import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdater_8 {
    private static class Test {
        public volatile long value;
    }

    public static void main(String[] args) {
        Test test = new Test();
        AtomicLongFieldUpdater<Test> updater = AtomicLongFieldUpdater.newUpdater(Test.class, "value");
        long newValue = updater.getAndAdd(test, 10);
        System.out.println("New value: " + test.value);
        System.out.println("Returned value: " + newValue);
    }
}
