import java.util.concurrent.CompletableFuture;

public class CompletableFuture_2 {
    public static void main(String[] args) {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");
        future.thenApply(s -> s + " World")
             .thenAccept(System.out::println);
    }
}
