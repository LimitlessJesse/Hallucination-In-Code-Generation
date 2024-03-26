import javax.swing.JSpinner;
import javax.swing.JSpinner.DefaultEditor;

public class JSpinner_DefaultEditor_5 {
    public static void main(String[] args) {
        JSpinner spinner = new JSpinner();
        DefaultEditor editor = new DefaultEditor(spinner);
        editor.getTextField().setText("10");
        editor.commitEdit();
    }
}
