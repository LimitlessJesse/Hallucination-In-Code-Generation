import java.util.concurrent.FutureTask;

public class FutureTask_1 {
    public static void main(String[] args) {
        FutureTask<String> task = new FutureTask<>(() -> {
            Thread.sleep(1000);
            return "Hello";
        });

        Thread thread = new Thread(task);
        thread.start();

        try {
            System.out.println(task.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Cancel the task
        boolean cancelled = task.cancel(true);
        System.out.println("Task cancelled: " + cancelled);
    }
}
