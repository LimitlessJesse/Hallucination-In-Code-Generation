import java.util.concurrent.*;

public class FutureTask_5 {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(() -> {
            TimeUnit.SECONDS.sleep(2);
            return "Hello, World!";
        });

        new Thread(futureTask).start();

        try {
            System.out.println(futureTask.get(3, TimeUnit.SECONDS));
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }
    }
}
