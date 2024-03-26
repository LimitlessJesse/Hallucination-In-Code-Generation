import javax.swing.*;
import javax.swing.event.*;

public class CaretEvent_2 {
    public static void main(String[] args) {
        JTextField textField = new JTextField();
        textField.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                int dot = e.getDot();
                System.out.println("Dot position: " + dot);
            }
        });
    }
}
