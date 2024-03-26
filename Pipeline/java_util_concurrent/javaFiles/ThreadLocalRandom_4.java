import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandom_4 {
    public static void main(String[] args) {
        boolean randomBoolean = ThreadLocalRandom.current().nextBoolean();
        System.out.println(randomBoolean);
    }
}
