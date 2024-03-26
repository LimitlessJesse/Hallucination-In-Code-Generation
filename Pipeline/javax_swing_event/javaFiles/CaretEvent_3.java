import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

public class CaretEvent_3 {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        textArea.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                int mark = e.getMark();
                System.out.println("Mark position: " + mark);
            }
        });
    }
}
