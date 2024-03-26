import javax.swing.*;
import java.awt.*;

public class JInternalFrame_17 {
    public static void main(String[] args) {
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        JButton button = new JButton("Click me");
        internalFrame.setContentPane(button);
        internalFrame.pack();
        internalFrame.setVisible(true);
    }
}
