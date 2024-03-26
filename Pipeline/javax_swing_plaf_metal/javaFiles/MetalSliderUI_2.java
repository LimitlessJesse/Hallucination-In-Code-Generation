import javax.swing.*;
import java.awt.*;

public class MetalSliderUI_2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JSlider slider = new JSlider(0, 100, 50);
        slider.setUI(new MetalSliderUI() {
            @Override
            protected void paintThumb(Graphics g) {
                // Your custom painting code here
                g.setColor(Color.RED);
                g.fillRect(thumbRect.x, thumbRect.y, thumbRect.width, thumbRect.height);
            }
        });

        frame.getContentPane().add(slider);
        frame.setVisible(true);
    }
}
