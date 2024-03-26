import java.util.SplittableRandom;

public class SplittableRandom_2 {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        long randomLong = random.nextLong();
        System.out.println(randomLong);
    }
}
