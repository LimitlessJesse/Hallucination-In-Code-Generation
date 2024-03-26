import javax.swing.*;
import javax.swing.plaf.basic.BasicRadioButtonUI;
import java.awt.*;

public class BasicRadioButtonUI_3 {
    public static void main(String[] args) {
        JRadioButton button = new JRadioButton("Radio Button");
        button.setUI(new BasicRadioButtonUI() {
            @Override
            public void paint(Graphics g, JComponent c) {
                super.paint(g, c);
                // Your custom painting code here
            }
        });
    }
}
