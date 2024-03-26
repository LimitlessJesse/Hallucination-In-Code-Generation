import java.awt.*;
import java.awt.event.*;

public class CheckboxGroup_5 {
    public static void main(String[] args) {
        Frame frame = new Frame("CheckboxGroup Example");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox checkbox1 = new Checkbox("Checkbox 1", cbg, true);
        Checkbox checkbox2 = new Checkbox("Checkbox 2", cbg, false);
        Checkbox checkbox3 = new Checkbox("Checkbox 3", cbg, false);

        frame.add(checkbox1);
        frame.add(checkbox2);
        frame.add(checkbox3);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setSize(300, 200);
        frame.setVisible(true);

        Button button = new Button("Get Selected Checkboxes");
        frame.add(button);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Checkbox[] selectedCheckboxes = cbg.getSelectedCheckboxes();
                if (selectedCheckboxes.length == 0) {
                    System.out.println("No checkboxes are selected.");
                } else {
                    for (Checkbox checkbox : selectedCheckboxes) {
                        System.out.println(checkbox.getLabel() + " is selected.");
                    }
                }
            }
        });
    }
}
