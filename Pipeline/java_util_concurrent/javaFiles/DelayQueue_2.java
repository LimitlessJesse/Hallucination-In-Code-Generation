import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueue_2 {
    public static void main(String[] args) {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        queue.add(new DelayedElement(1000, "Hello"));
        queue.add(new DelayedElement(500, "World"));

        try {
            DelayedElement element = queue.take();
            System.out.println(element.getData());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class DelayedElement implements Delayed {
    private long delay;
    private String data;

    public DelayedElement(long delay, String data) {
        this.delay = System.currentTimeMillis() + delay;
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = delay - System.currentTimeMillis();
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
