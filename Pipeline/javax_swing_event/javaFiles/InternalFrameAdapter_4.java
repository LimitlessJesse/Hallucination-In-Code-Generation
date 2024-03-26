import javax.swing.*;
import javax.swing.event.*;

public class InternalFrameAdapter_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(200, 150);
        internalFrame.setVisible(true);
        frame.add(internalFrame);

        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameDeactivated(InternalFrameEvent e) {
                System.out.println("Internal frame deactivated.");
            }
        });
    }
}
