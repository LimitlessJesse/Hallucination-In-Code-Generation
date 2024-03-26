import java.security.SecureRandom;

public class SecureRandom_3 {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        byte[] seed = {1, 2, 3, 4, 5};
        secureRandom.setSeed(seed);

        // Generate a random number
        int randomNumber = secureRandom.nextInt();
        System.out.println("Random number: " + randomNumber);
    }
}
