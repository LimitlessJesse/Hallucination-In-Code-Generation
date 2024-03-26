import javax.swing.*;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

public class InternalFrameAdapter_9 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("InternalFrameAdapter Example");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JInternalFrame internalFrame = new JInternalFrame("Internal Frame", true, true, true, true);
        internalFrame.setSize(200, 150);
        internalFrame.setVisible(true);

        internalFrame.addInternalFrameListener(new InternalFrameAdapter() {
            @Override
            public void internalFrameClosed(InternalFrameEvent e) {
                System.out.println("Internal frame closed");
            }
        });

        frame.add(internalFrame);
        frame.setVisible(true);
    }
}
