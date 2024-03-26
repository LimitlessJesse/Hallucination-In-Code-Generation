import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class BasicBorders_RadioButtonBorder_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        JRadioButton radioButton = new JRadioButton("Radio Button");
        radioButton.setBounds(50, 50, 100, 50);
        radioButton.setBorder(new BasicBorders.RadioButtonBorder());

        frame.getContentPane().add(radioButton);
    }
}
