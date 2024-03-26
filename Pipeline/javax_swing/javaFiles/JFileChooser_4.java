import javax.swing.JFileChooser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFileChooser_4 {
    public static void main(String[] args) {
        JFileChooser fileChooser = new JFileChooser();

        fileChooser.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)) {
                    // The user has clicked "Open" or "Save" button.
                    fileChooser.approveSelection();
                }
            }
        });
    }
}
