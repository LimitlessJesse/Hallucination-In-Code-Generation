import javax.swing.*;
import java.awt.*;

public class JSpinner_4 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        JComponent editor = spinner.getEditor();
        System.out.println(editor);
    }
}
