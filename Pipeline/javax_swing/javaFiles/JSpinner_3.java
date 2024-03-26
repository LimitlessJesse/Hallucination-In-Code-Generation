import javax.swing.*;
import java.awt.*;

public class JSpinner_3 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        JTextField textField = new JTextField();
        spinner.setEditor(textField);
    }
}
