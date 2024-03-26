import javax.swing.*;
import javax.swing.event.*;

public class InternalFrameAdapter_3 {
    public static void main(String[] args) {
        JInternalFrame frame = new JInternalFrame("Internal Frame");
        frame.addInternalFrameListener(new InternalFrameAdapter() {
            public void internalFrameClosing(InternalFrameEvent e) {
                // Handle the event when the internal frame is closing
                System.out.println("Internal frame is closing");
            }
        });
        frame.setVisible(true);
    }
}
