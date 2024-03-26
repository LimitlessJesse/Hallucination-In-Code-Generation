import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandom_5 {
    public static void main(String[] args) {
        double randomNumber = ThreadLocalRandom.current().nextGaussian();
        System.out.println("Random number: " + randomNumber);
    }
}
