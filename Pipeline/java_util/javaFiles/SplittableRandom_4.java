import java.util.SplittableRandom;

public class SplittableRandom_4 {
    public static void main(String[] args) {
        SplittableRandom random = new SplittableRandom();
        int randomNumber = random.nextInt(10); // Generates a random number between 0 (inclusive) and 10 (exclusive)
        System.out.println(randomNumber);
    }
}
