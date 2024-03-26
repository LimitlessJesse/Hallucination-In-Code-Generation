import javax.swing.ListSelectionModel;
import javax.swing.DefaultListSelectionModel;

public class DefaultListSelectionModel_5 {
    public static void main(String[] args) {
        ListSelectionModel model = new DefaultListSelectionModel();
        model.setValueIsAdjusting(true);
        // do something with the model
        model.setValueIsAdjusting(false);
    }
}
