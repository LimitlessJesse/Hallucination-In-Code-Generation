import java.util.concurrent.CompletableFuture;

public class CompletableFuture_1 {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            // This is the task that will be executed asynchronously
            System.out.println("Hello from the asynchronous task!");
        });

        // This will block until the asynchronous task is completed
        future.join();

        System.out.println("Main thread is done!");
    }
}
