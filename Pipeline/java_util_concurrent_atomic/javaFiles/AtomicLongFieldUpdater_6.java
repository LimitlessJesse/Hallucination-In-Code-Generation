import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdater_6 {
    private static class Test {
        public volatile long value;
    }

    public static void main(String[] args) {
        AtomicLongFieldUpdater<Test> updater = AtomicLongFieldUpdater.newUpdater(Test.class, "value");
        Test test = new Test();
        System.out.println(updater.getAndIncrement(test)); // prints 0
        System.out.println(test.value); // prints 1
    }
}
