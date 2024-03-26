import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandom_3 {
    public static void main(String[] args) {
        double randomDouble = ThreadLocalRandom.current().nextDouble();
        System.out.println("Random double: " + randomDouble);
    }
}
