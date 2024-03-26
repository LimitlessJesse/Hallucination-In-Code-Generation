import javax.swing.*;
import javax.swing.event.*;

public class InternalFrameAdapter_6 {
    public static void main(String[] args) {
        JInternalFrame frame = new JInternalFrame("Internal Frame");
        frame.addInternalFrameListener(new InternalFrameAdapter() {
            public void internalFrameIconified(InternalFrameEvent e) {
                // Handle the event when the internal frame is iconified
                System.out.println("Internal frame iconified");
            }
        });
        frame.pack();
        frame.setVisible(true);
    }
}
