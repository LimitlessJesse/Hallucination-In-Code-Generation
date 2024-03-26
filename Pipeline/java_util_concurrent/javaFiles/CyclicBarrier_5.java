import java.util.concurrent.CyclicBarrier;

public class CyclicBarrier_5 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3);
        System.out.println("Number of parties: " + barrier.getParties());
    }
}
