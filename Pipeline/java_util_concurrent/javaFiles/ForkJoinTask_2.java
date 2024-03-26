import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTask_2 {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinTask<Integer> task = new RecursiveTask<Integer>() {
            @Override
            protected Integer compute() {
                return 10;
            }
        };
        pool.execute(task);
        Integer result = task.getRawResult();
        System.out.println(result);
    }
}
