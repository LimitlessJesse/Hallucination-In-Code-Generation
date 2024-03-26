import javax.swing.*;
import java.awt.*;

public class TransferHandler_3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("TransferHandler Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setPreferredSize(new Dimension(200, 200));

        TransferHandler handler = panel.getTransferHandler();
        Transferable transferable = handler.createTransferable(panel);

        // Use the transferable object as needed...

        frame.add(panel);
        frame.setVisible(true);
    }
}
