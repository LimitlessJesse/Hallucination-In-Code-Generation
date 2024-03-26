import javax.swing.*;
import javax.swing.event.*;

public class InternalFrameAdapter_7 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);

        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameOpened(InternalFrameEvent e) {
                // Code to be executed when the internal frame is opened
                System.out.println("Internal frame opened");
            }
        });

        frame.add(internalFrame);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
