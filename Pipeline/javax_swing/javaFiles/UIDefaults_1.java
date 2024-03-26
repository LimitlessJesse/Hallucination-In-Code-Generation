import javax.swing.UIDefaults;
import javax.swing.JButton;
import java.awt.Color;

public class UIDefaults_1 {
    public static void main(String[] args) {
        UIDefaults defaults = new UIDefaults();
        JButton button = new JButton("Click me");
        defaults.put("Button.background", Color.RED);
        defaults.put("Button.foreground", Color.BLACK);
        button.setDefaults(defaults);

        Color background = (Color) defaults.get("Button.background");
        Color foreground = (Color) defaults.get("Button.foreground");

        System.out.println("Button Background: " + background);
        System.out.println("Button Foreground: " + foreground);
    }
}
