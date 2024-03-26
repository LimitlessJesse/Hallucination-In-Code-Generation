import javax.swing.*;
import javax.swing.plaf.basic.BasicSliderUI;
import java.awt.*;

public class BasicSliderUI_5 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        BasicSliderUI sliderUI = new BasicSliderUI(slider);
        Graphics g = slider.getGraphics();
        sliderUI.paintLabels(g);
    }
}
