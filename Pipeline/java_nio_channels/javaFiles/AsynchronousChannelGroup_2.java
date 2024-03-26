import java.nio.channels.AsynchronousChannelGroup;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AsynchronousChannelGroup_2 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        AsynchronousChannelGroup group = null;
        try {
            group = AsynchronousChannelGroup.withThreadPool(executor);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (group!= null) {
                try {
                    group.shutdown();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
