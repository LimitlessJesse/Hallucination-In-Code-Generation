import java.nio.channels.AsynchronousChannelGroup;
import java.util.concurrent.Executors;

public class AsynchronousChannelGroup_9 {
    public static void main(String[] args) throws Exception {
        AsynchronousChannelGroup group = AsynchronousChannelGroup.withThreadPool(Executors.newFixedThreadPool(10));

        // Add tasks to the group
        for (int i = 0; i < 10; i++) {
            group.execute(() -> {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        // Wait for all tasks to complete
        while (!group.isTerminated()) {
            Thread.sleep(100);
        }

        System.out.println("All tasks have completed.");

        group.shutdown();
    }
}
