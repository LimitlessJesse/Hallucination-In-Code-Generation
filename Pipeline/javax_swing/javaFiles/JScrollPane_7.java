import javax.swing.*;
import java.awt.*;

public class JScrollPane_7 {
    public static void main(String[] args) {
        JScrollPane scrollPane = new JScrollPane();
        JLabel label = new JLabel("Column Header");
        scrollPane.setColumnHeaderView(label);
    }
}
