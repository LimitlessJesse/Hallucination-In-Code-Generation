import java.lang.Character;

public class Character_2 {
    public static void main(String[] args) {
        char ch = 'a';
        boolean isLetter = Character.isLetter(ch);
        System.out.println("Is '" + ch + "' a letter? " + isLetter);
    }
}
