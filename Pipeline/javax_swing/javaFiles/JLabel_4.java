import javax.swing.*;
import java.awt.*;

public class JLabel_4 {
    public static void main(String[] args) {
        JLabel label = new JLabel("Hello", JLabel.CENTER);
        Icon icon = label.getIcon();
        if (icon!= null) {
            System.out.println("Icon found: " + icon);
        } else {
            System.out.println("No icon found");
        }
    }
}
