import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayQueue_3 {
    public static void main(String[] args) {
        DelayQueue<DelayedElement> queue = new DelayQueue<>();
        queue.add(new DelayedElement(1000, "Hello"));
        queue.add(new DelayedElement(500, "World"));

        DelayedElement element = queue.poll();
        if (element!= null) {
            System.out.println(element.getData());
        }
    }

    static class DelayedElement implements Delayed {
        private final long delay;
        private final long expiry;
        private final String data;

        public DelayedElement(long delay, String data) {
            this.delay = delay;
            this.data = data;
            this.expiry = System.currentTimeMillis() + delay;
        }

        public String getData() {
            return data;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            return unit.convert(this.expiry - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override
        public int compareTo(Delayed other) {
            if (other == this) {
                return 0;
            }
            if (other instanceof DelayedElement) {
                DelayedElement x = (DelayedElement) other;
                long diff = this.expiry - x.expiry;
                if (diff < 0) {
                    return -1;
                } else if (diff > 0) {
                    return 1;
                } else if (this.data!= x.data) {
                    return (this.data!= null)? this.data.compareTo(x.data) : 0;
                }
                return 0;
            }
            long diff = getDelay(TimeUnit.MILLISECONDS) - other.getDelay(TimeUnit.MILLISECONDS);
            return (diff < 0)? -1 : (diff > 0)? 1 : 0;
        }
    }
}
