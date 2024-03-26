import java.awt.Color;

public class Color_5 {
    public static void main(String[] args) {
        Color color1 = new Color(100, 150, 200);
        Color color2 = new Color(100, 150, 200);
        Color color3 = new Color(200, 150, 100);

        System.out.println(color1.equals(color2));  // Output: true
        System.out.println(color1.equals(color3));  // Output: false
    }
}
