import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxEditor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicComboBoxEditor_2 {
    public static void main(String[] args) {
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.setEditable(true);
        BasicComboBoxEditor editor = new BasicComboBoxEditor(comboBox);

        editor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // This code will be executed when the user presses Enter or Tab
                System.out.println("Action performed: " + editor.getItem());
            }
        });

        comboBox.setEditor(editor);
    }
}
