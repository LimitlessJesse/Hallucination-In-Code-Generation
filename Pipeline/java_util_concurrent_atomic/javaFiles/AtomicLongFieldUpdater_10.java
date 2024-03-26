import java.util.concurrent.atomic.AtomicLongFieldUpdater;

public class AtomicLongFieldUpdater_10 {
    private static class Test {
        public volatile long value;
    }

    public static void main(String[] args) {
        AtomicLongFieldUpdater<Test> updater = AtomicLongFieldUpdater.newUpdater(Test.class, "value");
        Test test = new Test();
        test.value = 10;
        System.out.println(updater.decrementAndGet(test)); // prints 9
        System.out.println(test.value); // prints 9
    }
}
