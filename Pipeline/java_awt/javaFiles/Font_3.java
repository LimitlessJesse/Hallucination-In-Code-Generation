import java.awt.Font;

public class Font_3 {
    public static void main(String[] args) {
        Font originalFont = new Font("Arial", Font.PLAIN, 12);
        System.out.println("Original Font: " + originalFont);

        // Create a new font that is 15pt larger than the original font
        Font largerFont = originalFont.deriveFont(15.0f);
        System.out.println("Larger Font: " + largerFont);

        // Create a new font that is 10pt smaller than the original font
        Font smallerFont = originalFont.deriveFont(10.0f);
        System.out.println("Smaller Font: " + smallerFont);
    }
}
