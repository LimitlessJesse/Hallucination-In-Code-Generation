import javax.swing.*;
import java.awt.*;

public class JScrollPane_8 {
    public static void main(String[] args) {
        JScrollPane scrollPane = new JScrollPane();
        JLabel label = new JLabel("Row Header");
        scrollPane.setRowHeaderView(label);
    }
}
