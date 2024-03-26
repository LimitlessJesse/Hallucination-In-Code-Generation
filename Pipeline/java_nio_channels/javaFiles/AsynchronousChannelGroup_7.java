import java.nio.channels.AsynchronousChannelGroup;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AsynchronousChannelGroup_7 {
    public static void main(String[] args) throws Exception {
        AsynchronousChannelGroup group = AsynchronousChannelGroup.withThreadPool(Executors.newFixedThreadPool(10));

        // Your code here

        group.shutdownNow();
        group.awaitTermination(10, TimeUnit.SECONDS);
    }
}
