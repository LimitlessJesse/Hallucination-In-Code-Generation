import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdater_7 {
    private static class Test {
        public volatile long value;
    }

    public static void main(String[] args) {
        AtomicLongFieldUpdater<Test> updater = AtomicLongFieldUpdater.newUpdater(Test.class, "value");
        Test test = new Test();
        test.value = 10;

        long result = updater.getAndDecrement(test);

        System.out.println("Result: " + result);
        System.out.println("Updated value: " + test.value);
    }
}
