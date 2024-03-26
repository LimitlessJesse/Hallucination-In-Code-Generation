import java.util.SplittableRandom;

public class SplittableRandom_5 {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        long bound = 100;
        long randomLong = random.nextLong(bound);
        System.out.println("Generated random long: " + randomLong);
    }
}
