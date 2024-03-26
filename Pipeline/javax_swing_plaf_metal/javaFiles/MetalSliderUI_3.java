import javax.swing.*;
import javax.swing.plaf.metal.MetalSliderUI;
import java.awt.*;

public class MetalSliderUI_3 {
    public static void main(String[] args) {
        JSlider slider = new JSlider();
        MetalSliderUI sliderUI = new MetalSliderUI(slider);
        sliderUI.getTrack().paintTrack(new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Your code here
            }
        }.getGraphics());
    }
}
