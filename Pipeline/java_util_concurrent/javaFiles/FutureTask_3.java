import java.util.concurrent.FutureTask;

public class FutureTask_3 {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(() -> "Hello");
        new Thread(futureTask).start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Is task done? " + futureTask.isDone());
    }
}
