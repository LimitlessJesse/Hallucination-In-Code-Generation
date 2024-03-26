import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandom_1 {
    public static void main(String[] args) {
        int randomNum = ThreadLocalRandom.current().nextInt();
        System.out.println("Random number: " + randomNum);
    }
}
