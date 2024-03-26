import java.nio.channels.AsynchronousChannelGroup;
import java.util.concurrent.Executors;

public class AsynchronousChannelGroup_6 {
    public static void main(String[] args) throws Exception {
        AsynchronousChannelGroup group = AsynchronousChannelGroup.withThreadPool(Executors.newFixedThreadPool(10));
        //...
        // Use the group
        //...
        group.shutdown();
    }
}
