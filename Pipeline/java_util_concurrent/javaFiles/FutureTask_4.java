import java.util.concurrent.FutureTask;

public class FutureTask_4 {
    public static void main(String[] args) {
        FutureTask<String> futureTask = new FutureTask<>(() -> "Hello, World!");
        new Thread(futureTask).start();

        try {
            String result = futureTask.get();
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
