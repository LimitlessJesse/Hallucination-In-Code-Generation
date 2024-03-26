import javax.swing.*;
import javax.swing.plaf.basic.BasicSeparatorUI;
import java.awt.*;

public class BasicSeparatorUI_1 {
    public static void main(String[] args) {
        JSeparator separator = new JSeparator();
        separator.setUI(new BasicSeparatorUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                // Your custom painting code here
                super.paint(g, c);
            }
        });
        // Now you can use the separator as you would normally
    }
}
