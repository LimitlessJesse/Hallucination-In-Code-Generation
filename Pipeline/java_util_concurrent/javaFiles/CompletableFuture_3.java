import java.util.concurrent.CompletableFuture;

public class CompletableFuture_3 {
    public static void main(String[] args) {
        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> "Hello")
               .thenAccept(System.out::println);

        future.join();
    }
}
