import java.util.concurrent.FutureTask;

public class FutureTask_2 {
    public static void main(String[] args) {
        FutureTask<String> task = new FutureTask<>(() -> "Hello");
        task.run();
        System.out.println("Task is cancelled: " + task.isCancelled());
    }
}
