import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueue_4 {
    public static void main(String[] args) {
        DelayQueue<DelayedElement> delayQueue = new DelayQueue<>();
        delayQueue.add(new DelayedElement(1000, "Element 1"));
        delayQueue.add(new DelayedElement(2000, "Element 2"));

        DelayedElement head = delayQueue.peek();
        if (head!= null) {
            System.out.println("Head of the DelayQueue: " + head.getData());
        } else {
            System.out.println("DelayQueue is empty");
        }
    }
}

class DelayedElement implements Delayed {
    private long delayInMillis;
    private String data;

    public DelayedElement(long delayInMillis, String data) {
        this.delayInMillis = System.currentTimeMillis() + delayInMillis;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = delayInMillis - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.getDelay(TimeUnit.MILLISECONDS) < o.getDelay(TimeUnit.MILLISECONDS)) {
            return -1;
        } else if (this.getDelay(TimeUnit.MILLISECONDS) > o.getDelay(TimeUnit.MILLISECONDS)) {
            return 1;
        }
        return 0;
    }
}
