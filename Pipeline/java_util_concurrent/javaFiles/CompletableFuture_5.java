import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture_5 {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            if (Math.random() < 0.5) {
                throw new RuntimeException("Oops, something went wrong!");
            }
            return "Hello, World!";
        });

        future.exceptionally(ex -> {
            System.out.println("An exception occurred: " + ex.getMessage());
            return "Default value";
        }).thenAccept(System.out::println);

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
