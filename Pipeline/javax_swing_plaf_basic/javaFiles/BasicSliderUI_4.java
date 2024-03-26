import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;

public class BasicSliderUI_4 {
    public static void main(String[] args) {
        JSlider slider = new JSlider(0, 100, 50);
        BasicSliderUI ui = new BasicSliderUI(slider) {
            @Override
            protected void paintTicks(Graphics g) {
                // Your code here
            }
        };
        slider.setUI(ui);
    }
}
