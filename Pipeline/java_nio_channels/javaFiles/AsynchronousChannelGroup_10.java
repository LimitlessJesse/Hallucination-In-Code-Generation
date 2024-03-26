import java.nio.channels.AsynchronousChannelGroup;
import java.util.concurrent.TimeUnit;

public class AsynchronousChannelGroup_10 {
    public static void main(String[] args) throws Exception {
        AsynchronousChannelGroup group = AsynchronousChannelGroup.withThreadPool(Executors.newFixedThreadPool(10));

        // Add channels to the group
        AsynchronousChannel channel1 = AsynchronousChannel.open(group);
        AsynchronousChannel channel2 = AsynchronousChannel.open(group);

        // Wait for the termination of all channels in the group
        boolean isTerminated = group.awaitTermination(10, TimeUnit.SECONDS);

        if (isTerminated) {
            System.out.println("All channels in the group have been terminated.");
        } else {
            System.out.println("Not all channels in the group have been terminated within the specified timeout.");
        }

        // Close the group
        group.close();
    }
}
