import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandom_2 {
    public static void main(String[] args) {
        long randomLong = ThreadLocalRandom.current().nextLong();
        System.out.println("Random Long: " + randomLong);
    }
}
