import java.util.Random;

public class Random_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNum = rand.nextInt(10); // Generates a random integer between 0 and 10
        System.out.println("Random number: " + randomNum);
    }
}
