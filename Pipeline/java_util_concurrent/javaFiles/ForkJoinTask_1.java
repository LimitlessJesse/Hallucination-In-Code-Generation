import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTask_1 {
    public static void main(String[] args) {
        RecursiveTask<Integer> task = new RecursiveTask<Integer>() {
            @Override
            protected Integer compute() {
                // Some computation here
                return 1;
            }
        };

        ForkJoinTask<Integer> forkedTask = task.fork();

        // Do some other work here

        // Wait for the forked task to complete
        Integer result = forkedTask.join();

        System.out.println("Result: " + result);
    }
}
