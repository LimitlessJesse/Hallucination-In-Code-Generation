import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueue_1 {
    public static void main(String[] args) {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        DelayedElement element = new DelayedElement(1000);
        boolean added = queue.add(element);
        System.out.println("Element added: " + added);
    }
}

class DelayedElement implements Delayed {
    private long delay;

    public DelayedElement(long delay) {
        this.delay = System.currentTimeMillis() + delay;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return unit.convert(delay - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        return Long.compare(this.getDelay(TimeUnit.MILLISECONDS), o.getDelay(TimeUnit.MILLISECONDS));
    }
}
