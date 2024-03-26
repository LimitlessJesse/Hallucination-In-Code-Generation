import java.awt.Dialog;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Dialog_4 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        frame.setSize(300, 200);
        frame.setVisible(true);

        Dialog dialog = new Dialog(frame, "Dialog", true);
        dialog.setSize(100, 100);
        dialog.setVisible(true);

        // Hide the dialog
        dialog.setVisible(false);
    }
}
