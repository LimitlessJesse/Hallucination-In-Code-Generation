import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

public class ForkJoinWorkerThread_3 {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        ForkJoinWorkerThread worker = pool.getForkJoinWorkerThread(null);
        worker.start();
        try {
            worker.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
