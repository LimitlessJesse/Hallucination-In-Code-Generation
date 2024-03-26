import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_4 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);
        System.out.println("Number of threads waiting at the barrier: " + barrier.getNumberWaiting());
    }
}
